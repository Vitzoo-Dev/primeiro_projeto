import java.util.Scanner;

/**
 * Exercício 03 - Sequência de Fibonacci
 * Leia a quantidade de termos e exiba a sequência de Fibonacci.
 */
public class Repeticao03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Quantos termos? ");
            int n = sc.nextInt();

            long anterior = 0, atual = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(anterior + " ");
                long proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
            System.out.println();
            sc.close();
        }
    }
}