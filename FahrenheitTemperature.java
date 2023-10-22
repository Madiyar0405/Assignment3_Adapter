public class FahrenheitTemperature implements Temperature{
    private double value;

    public FahrenheitTemperature(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
