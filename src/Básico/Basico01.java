package Básico;
/**
 * Exercício 01 - Olá, Mundo e tipos de dados
 * Exiba "Olá, Mundo!" e declare variáveis dos tipos mais comuns.
 */
public class Basico01 {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");

        String nome = "Victor";
        int idade = 27;
        double altura = 1.73;
        char inicial = nome.charAt(0);
        boolean estudante = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("É estudante? " + estudante);
    }
}