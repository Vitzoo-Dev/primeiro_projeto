package Strings;
import java.util.Scanner;

/**
 * Exercício 04 - Capitalizar e contar palavras
 * Leia uma frase, conte as palavras e coloque a primeira letra de cada uma em maiúscula.
 */
public class Strings04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite uma frase: ");
            String frase = sc.nextLine().trim();

            if (frase.isEmpty()) {
                System.out.println("Nenhuma palavra informada.");
                return;
            }

            String[] palavras = frase.split("\\s+");
            StringBuilder resultado = new StringBuilder();
            for (String p : palavras) {
                resultado.append(Character.toUpperCase(p.charAt(0)))
                         .append(p.substring(1).toLowerCase())
                         .append(" ");
            }

            System.out.println("Quantidade de palavras: " + palavras.length);
            System.out.println("Capitalizada: " + resultado.toString().trim());
            sc.close();
        }
    }
}