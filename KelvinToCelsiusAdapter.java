public class KelvinToCelsiusAdapter implements Temperature{
    private TemperatureScale scale;

    public KelvinToCelsiusAdapter(TemperatureScale scale) {
        this.scale = scale;
    }

    public double getValue() {
        // Формула для конвертации: Кельвины - 273.15
        return scale.convertFromCelsius(scale.convertToCelsius(0) - 273.15);
    }
}
