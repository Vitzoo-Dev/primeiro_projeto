package Coleções;
import java.util.Map;
import java.util.TreeMap;

/**
 * Exercício 03 - Map
 * Conte quantas vezes cada palavra aparece em um texto.
 */
public class Colecoes03 {
    public static void main(String[] args) {
        String texto = "java é bom java é divertido e java é poderoso";
        Map<String, Integer> contagem = new TreeMap<>();

        for (String palavra : texto.split(" ")) {
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : contagem.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}