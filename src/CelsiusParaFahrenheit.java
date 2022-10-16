public class CelsiusParaFahrenheit {
    public static void main(String[] args) {

        double celsius1 = 30.0;
        double celsius2 = 17.2;
        double fahrenheit1 = conversor(celsius1);
        double fahrenheit2 = conversor(celsius2);
        System.out.printf("Temperatura 1 %.2fºC são %.2fºF%n", celsius1, fahrenheit1);
        System.out.printf("Temperatura 2 %.2fºC são %.2fºF", celsius2, fahrenheit2);
    }

    static double conversor(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
