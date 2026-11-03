package StreamsLambda;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Exercício 03 - Collectors
 * Agrupe palavras pelo tamanho e separe números em pares e ímpares.
 */
public class StreamsLambda03 {
    public static void main(String[] args) {
        List<String> palavras = List.of("java", "lambda", "stream", "api", "map", "filter", "set");

        Map<Integer, List<String>> porTamanho = palavras.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Agrupadas por tamanho: " + porTamanho);

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> paresImpares = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Pares: " + paresImpares.get(true));
        System.out.println("Ímpares: " + paresImpares.get(false));

        String juntas = palavras.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Em maiúsculas: " + juntas);
    }
}