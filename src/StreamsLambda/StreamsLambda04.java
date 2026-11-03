package StreamsLambda;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Exercício 04 - Interfaces funcionais e expressões lambda
 * Use Predicate, Function, Consumer, Supplier e BiFunction com lambdas
 * e referências a métodos.
 */
public class StreamsLambda04 {
    public static void main(String[] args) {
        Predicate<Integer> ehPositivo = n -> n > 0;
        Function<String, Integer> tamanho = String::length;
        Consumer<String> imprimir = s -> System.out.println(">> " + s);
        Supplier<Double> aleatorio = Math::random;
        BiFunction<Integer, Integer, Integer> multiplicar = (a, b) -> a * b;

        System.out.println("5 é positivo? " + ehPositivo.test(5));
        System.out.println("-2 é positivo? " + ehPositivo.test(-2));
        System.out.println("Tamanho de \"lambda\": " + tamanho.apply("lambda"));
        imprimir.accept("Olá com Consumer");
        System.out.println("Número aleatório: " + aleatorio.get());
        System.out.println("6 x 7 = " + multiplicar.apply(6, 7));

        // Composição de funções
        Function<Integer, Integer> dobro = n -> n * 2;
        Function<Integer, Integer> maisDez = n -> n + 10;
        System.out.println("(5 * 2) + 10 = " + dobro.andThen(maisDez).apply(5));
    }
}