public class KelvinScale implements TemperatureScale{
    public double convertToCelsius(double value) {
        return value - 273.15;
    }

    public double convertFromCelsius(double celsiusValue) {
        return celsiusValue + 273.15;
    }
}
