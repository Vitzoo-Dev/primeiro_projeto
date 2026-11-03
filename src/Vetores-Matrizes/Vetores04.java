/**
 * Exercício 04 - Matriz transposta
 * Dada uma matriz 2x3, gere e exiba sua transposta (3x2).
 */
public class Vetores04 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        int[][] transposta = new int[3][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Transposta:");
        for (int[] linha : transposta) {
            for (int valor : linha) {
                System.out.printf("%3d", valor);
            }
            System.out.println();
        }
    }
}