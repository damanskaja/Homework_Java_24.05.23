public class Main {
    public static void main(String[] args) {
        Converter myConvertor = new Converter();
        double celsius = 25.0;

        System.out.println("Конвертация с использованием методов void:");
        myConvertor.convertToKelvin(celsius);
        myConvertor.convertToFahrenheit(celsius);

        System.out.println("Конвертация с использованием методов, возвращающих результат:");
        double kelvin = myConvertor.convertToKelvinReturn(celsius);
        double fahrenheit = myConvertor.convertToFahrenheitReturn(celsius);
        System.out.println(celsius + " градусов Цельсия = " + kelvin + " Кельвин");
        System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " градусов Фаренгейта");
    }
}
