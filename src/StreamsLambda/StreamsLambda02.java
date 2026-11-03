package StreamsLambda;
import java.util.List;

/**
 * Exercício 02 - reduce e estatísticas
 * Calcule soma, média, maior e menor valor de uma lista usando streams.
 */
public class StreamsLambda02 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(10, 25, 3, 47, 18, 6);

        int soma = numeros.stream().reduce(0, Integer::sum);
        double media = numeros.stream().mapToInt(Integer::intValue).average().orElse(0);
        int maior = numeros.stream().max(Integer::compare).orElseThrow();
        int menor = numeros.stream().min(Integer::compare).orElseThrow();

        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}