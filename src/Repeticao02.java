import java.util.Scanner;

/**
 * Exercício 02 - Fatorial
 * Leia um número inteiro não negativo e calcule seu fatorial (usando while).
 */
public class Repeticao02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número (0 a 20): ");
            int n = sc.nextInt();

            if (n < 0 || n > 20) {
                System.out.println("Número fora do intervalo permitido.");
                return;
            }

            long fatorial = 1;
            int i = n;
            while (i > 1) {
                fatorial *= i;
                i--;
            }

            System.out.println(n + "! = " + fatorial);
            sc.close();
        }
    }
}