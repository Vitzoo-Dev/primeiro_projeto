package Coleções;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Exercício 02 - Set
 * Remova elementos duplicados de uma lista usando Set,
 * mantendo a ordem original de inserção.
 */
public class Colecoes02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 3, 5, 1, 3, 8, 1, 9, 8);
        System.out.println("Com duplicados: " + numeros);

        Set<Integer> unicos = new LinkedHashSet<>(numeros);
        System.out.println("Sem duplicados: " + unicos);
        System.out.println("Quantidade de elementos únicos: " + unicos.size());
    }
}