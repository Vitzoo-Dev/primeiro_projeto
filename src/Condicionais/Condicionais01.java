package Condicionais;
import java.util.Scanner;
import java.util.Locale;

/**
 * Exercício 01 - Par ou ímpar
 * Leia um número inteiro e informe se é par ou ímpar.
 */
public class Condicionais01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println(n + " é par.");
            } else {
                System.out.println(n + " é ímpar.");
            }
            sc.close();
        }
    }
}