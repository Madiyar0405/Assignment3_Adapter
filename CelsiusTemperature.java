public class CelsiusTemperature implements Temperature{
    private double value;


    public CelsiusTemperature(double value) {
        this.value = value;
    }


    @Override
    public double getValue() {
        return value;
    }
}
