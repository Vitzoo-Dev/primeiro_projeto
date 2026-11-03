package Coleções;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Exercício 04 - Ordenação com Comparator
 * Ordene uma lista de pessoas por nome e depois por idade (decrescente).
 */
public class Colecoes04 {

    record Pessoa(String nome, int idade) { }

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Carlos", 30));
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("Bruno", 41));
        pessoas.add(new Pessoa("Diana", 19));

        pessoas.sort(Comparator.comparing(Pessoa::nome));
        System.out.println("Por nome:");
        pessoas.forEach(p -> System.out.println("  " + p));

        pessoas.sort(Comparator.comparingInt(Pessoa::idade).reversed());
        System.out.println("Por idade (decrescente):");
        pessoas.forEach(p -> System.out.println("  " + p));
    }
}