package Strings;
import java.util.Scanner;

/**
 * Exercício 02 - Palíndromo
 * Leia uma palavra ou frase e informe se é um palíndromo
 * (ignorando espaços e maiúsculas/minúsculas).
 */
public class Strings02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite uma palavra ou frase: ");
            String texto = sc.nextLine();

            String limpo = texto.replaceAll("\\s+", "").toLowerCase();
            String invertido = new StringBuilder(limpo).reverse().toString();

            if (limpo.equals(invertido)) {
                System.out.println("\"" + texto + "\" é um palíndromo.");
            } else {
                System.out.println("\"" + texto + "\" não é um palíndromo.");
                sc.close();
            }
        }
    }
}