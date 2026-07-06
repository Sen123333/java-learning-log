public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        
        double c = 25.0;
        double f = converter.celsiusToFahrenheit(c);
        System.out.println(c + " C = " + f + " F");
        
        double f2 = 77.0;
        double c2 = converter.fahrenheitToCelsius(f2);
        System.out.println(f2 + " F = " + c2 + " C");
    }
}
