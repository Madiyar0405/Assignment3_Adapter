public class FahrenheitScale implements TemperatureScale{
    public double convertToCelsius(double value) {
        return (value - 32) * 5/9;
    }

    public double convertFromCelsius(double celsiusValue) {
        return (celsiusValue * 9/5) + 32;
    }
}
