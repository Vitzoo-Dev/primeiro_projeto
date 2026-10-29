import java.util.Scanner;
import java.util.Locale;

/**
 * Exercício 01 - Estatísticas de um vetor
 * Leia N números e exiba a soma, a média, o maior e o menor valor.
 */
public class Vetores01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Quantidade de números: ");
            int n = sc.nextInt();
            double[] valores = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                valores[i] = sc.nextDouble();
            }

            double soma = 0, maior = valores[0], menor = valores[0];
            for (double v : valores) {
                soma += v;
                if (v > maior) maior = v;
                if (v < menor) menor = v;
            }

            System.out.printf("Soma: %.2f%n", soma);
            System.out.printf("Média: %.2f%n", soma / n);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            sc.close();
        }
    }
}