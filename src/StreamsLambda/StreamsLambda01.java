package StreamsLambda;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercício 01 - filter, map e sorted
 * Dada uma lista de números, filtre os pares, eleve-os ao quadrado
 * e exiba o resultado ordenado de forma decrescente.
 */
public class StreamsLambda01 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(7, 2, 9, 4, 12, 5, 8, 3, 10);

        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        System.out.println("Original: " + numeros);
        System.out.println("Pares ao quadrado (decrescente): " + resultado);
    }
}