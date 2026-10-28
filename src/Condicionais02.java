import java.util.Scanner;
import java.util.Locale;

/**
 * Exercício 02 - Maior de três números
 * Leia três números e exiba o maior deles.
 */
public class Condicionais02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Primeiro número: ");
            double a = sc.nextDouble();
            System.out.print("Segundo número: ");
            double b = sc.nextDouble();
            System.out.print("Terceiro número: ");
            double c = sc.nextDouble();

            double maior = a;
            if (b > maior) maior = b;
            if (c > maior) maior = c;

            System.out.println("O maior número é: " + maior);
            sc.close();
        }
    }
}