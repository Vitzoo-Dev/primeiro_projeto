import java.util.Scanner;
import java.util.Locale;

/**
 * Exercício 03 - Conversão de temperatura
 * Leia uma temperatura em Celsius e converta para Fahrenheit e Kelvin.
 */
public class Basico03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Temperatura em °C: ");
            double celsius = sc.nextDouble();

            double fahrenheit = celsius * 9 / 5 + 32;
            double kelvin = celsius + 273.15;

            System.out.printf("%.2f °C = %.2f °F%n", celsius, fahrenheit);
            System.out.printf("%.2f °C = %.2f K%n", celsius, kelvin);
            sc.close();
        }
    }
}