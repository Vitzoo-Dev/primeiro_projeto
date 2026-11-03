package Strings;
import java.util.Scanner;

/**
 * Exercício 03 - Inverter texto e palavras
 * Leia uma frase e exiba: o texto invertido e as palavras em ordem inversa.
 */
public class Strings03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite uma frase: ");
            String frase = sc.nextLine();

            System.out.println("Texto invertido: " + new StringBuilder(frase).reverse());

            String[] palavras = frase.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (int i = palavras.length - 1; i >= 0; i--) {
                sb.append(palavras[i]).append(" ");
            }
            System.out.println("Palavras invertidas: " + sb.toString().trim());
            sc.close();
        }
    }
}