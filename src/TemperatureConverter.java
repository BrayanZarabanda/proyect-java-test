

public class TemperatureConverter {
    public static void main(String[] args) {
        int fahrenheit = 98;
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        String message = fahrenheit + "°F is equal to " + celsius + "°C";
        System.out.println(message);

        double roundedCelsius = Math.round(celsius*100.0) / 100.0;
        String formattedMessage = String.format("%d F is iqual to %.2f°C", fahrenheit, roundedCelsius);

        celsius = 37.0;
        fahrenheit = (int) (celsius * 9.0 / 5.0 + 32);
        System.out.println(celsius + "°C is " + fahrenheit + "°F");
    }
}
