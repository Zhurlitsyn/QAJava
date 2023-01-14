package lesson8;

public class BaseConvert {
    private double tempCelsius;

    public BaseConvert(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public void setTempCelsius(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public void convertTemp(double tempCelsius) {
        double tempKelvin = tempCelsius + 273.15;
        double tempFahrenheit = 1.8 * tempCelsius + 32.0;
        System.out.println("Temperature in Celsius: " + tempCelsius);
        System.out.print("Temperature in Kelvin: ");
        System.out.printf("%.2f", tempKelvin);
        System.out.print("Temperature in Fahrenheit: ");
        System.out.printf("%.2f", tempFahrenheit);

    }
}
