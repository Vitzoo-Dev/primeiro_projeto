package Repetição;
import java.util.Scanner;

/**
 * Exercício 01 - Tabuada
 * Leia um número e exiba sua tabuada de 1 a 10 (usando for).
 */
public class Repeticao01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Tabuada de qual número? ");
            int n = sc.nextInt();

            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", n, i, n * i);
            }
            sc.close();
        }
    }
}