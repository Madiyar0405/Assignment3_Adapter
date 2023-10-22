import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите градусы: ");
        double value = scanner.nextDouble();

        System.out.print("Выберите исходную шкалу (Celsius/Fahrenheit/Kelvin): ");
        String sourceScale = scanner.next();

        System.out.print("Выберите шкалу конвертации (Celsius/Fahrenheit/Kelvin): ");
        String targetScale = scanner.next();

        Temperature temperature;
        TemperatureScale sourceTemperatureScale = getTemperatureScale(sourceScale);
        TemperatureScale targetTemperatureScale = getTemperatureScale(targetScale);

        if (sourceTemperatureScale != null && targetTemperatureScale != null) {
            if (sourceTemperatureScale instanceof CelsiusScale) {
                temperature = new CelsiusTemperature(value);
            } else if (sourceTemperatureScale instanceof FahrenheitScale) {
                temperature = new FahrenheitTemperature(value);
            } else {
                temperature = new KelvinTemperature(value);
            }

            double convertedValue = targetTemperatureScale.convertFromCelsius(sourceTemperatureScale.convertToCelsius(temperature.getValue()));
            System.out.println("Результат: " + convertedValue + " " + targetScale);
        } else {
            System.out.println("Неправильно выбрана шкала.");
        }
    }

    private static TemperatureScale getTemperatureScale(String scale) {
        if (scale.equalsIgnoreCase("Celsius")) {
            return new CelsiusScale();
        } else if (scale.equalsIgnoreCase("Fahrenheit")) {
            return new FahrenheitScale();
        } else if (scale.equalsIgnoreCase("Kelvin")) {
            return new KelvinScale();
        }
        return null;
    }

}
