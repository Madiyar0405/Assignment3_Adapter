public class CelsiusToFahrenheitAdapter implements Temperature{
    private TemperatureScale scale;

    public CelsiusToFahrenheitAdapter(TemperatureScale scale) {
        this.scale = scale;
    }

    public double getValue() {
        // Формула для конвертации: (градусы Цельсия * 9/5) + 32
        return scale.convertFromCelsius(scale.convertToCelsius(0) * 9/5) + 32;
    }

}
