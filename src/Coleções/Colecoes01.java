package Coleções;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exercício 01 - ArrayList
 * Adicione, remova, busque e ordene elementos em uma lista de nomes.
 */
public class Colecoes01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Diana");

        System.out.println("Lista: " + nomes);
        System.out.println("Tamanho: " + nomes.size());
        System.out.println("Contém Ana? " + nomes.contains("Ana"));

        nomes.remove("Bruno");
        Collections.sort(nomes);
        System.out.println("Após remover Bruno e ordenar: " + nomes);

        for (String nome : nomes) {
            System.out.println("- " + nome);
        }
    }
}