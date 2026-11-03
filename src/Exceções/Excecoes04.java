package Exceções;
/**
 * Exercício 04 - Validação com exceções
 * Crie um método que valide idade (0 a 130) lançando IllegalArgumentException
 * e trate o erro no main.
 */
public class Excecoes04 {

    static void validarIdade(int idade) {
        if (idade < 0 || idade > 130) {
            throw new IllegalArgumentException("Idade inválida: " + idade);
        }
        System.out.println("Idade válida: " + idade);
    }

    public static void main(String[] args) {
        int[] idades = {25, -3, 200, 60};

        for (int idade : idades) {
            try {
                validarIdade(idade);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}