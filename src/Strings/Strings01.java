package Strings;
import java.util.Scanner;
/**
 * Exercício 01 - Contar vogais
 * Leia uma frase e conte quantas vogais ela possui.
 */
public class Strings01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite uma frase: ");
            String frase = sc.nextLine().toLowerCase();

            int vogais = 0;
            for (char c : frase.toCharArray()) {
                if ("aeiouáéíóúâêôãõà".indexOf(c) >= 0) vogais++;
            }

            System.out.println("Quantidade de vogais: " + vogais);
            sc.close();
        }
    }
}