import java.util.Scanner;
import java.util.Locale;

/**
 * Exercício 02 - Operadores aritméticos
 * Leia dois números e exiba soma, subtração, multiplicação, divisão e resto.
 */
public class Basico02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Primeiro número: ");
            double a = sc.nextDouble();
            System.out.print("Segundo número: ");
            double b = sc.nextDouble();

            System.out.println("Soma: " + (a + b));
            System.out.println("Subtração: " + (a - b));
            System.out.println("Multiplicação: " + (a * b));
            if (b != 0) {
                System.out.println("Divisão: " + (a / b));
                System.out.println("Resto: " + (a % b));
            } else {
                System.out.println("Divisão e resto: impossível dividir por zero.");
            }
        }
    }
}
