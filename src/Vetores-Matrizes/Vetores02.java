import java.util.Arrays;

/**
 * Exercício 02 - Inverter vetor
 * Dado um vetor de inteiros, inverta a ordem dos elementos sem criar outro vetor.
 */
public class Vetores02 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original: " + Arrays.toString(vetor));

        for (int i = 0; i < vetor.length / 2; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }

        System.out.println("Invertido: " + Arrays.toString(vetor));
    }
}