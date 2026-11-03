/**
 * Exercício 03 - Soma de matrizes
 * Some duas matrizes 3x3 e exiba o resultado.
 */
public class Vetores03 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] soma = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Resultado da soma:");
        for (int[] linha : soma) {
            for (int valor : linha) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }
} 