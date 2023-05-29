public class Converter {
    public static void convertToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        System.out.println(celsius + " градусов Цельсия = " + kelvin + " Кельвин");
    }

    public static void convertToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " градусов Фаренгейта");
    }

    public static double convertToKelvinReturn(double celsius) {
        return celsius + 273.15;
    }

    public static double convertToFahrenheitReturn(double celsius) {
        return (celsius * 9/5) + 32;
    }
}