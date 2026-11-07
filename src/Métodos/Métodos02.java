
package Métodos;

/**
 * Exercício 02 - Recursão
 * Implemente fatorial e Fibonacci de forma recursiva.
 */

public class Métodos02 {

    // Calcula o fatorial de um número
    static long fatorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                "Não existe fatorial de número negativo."
            );
        }

        if (n > 20) {
            throw new IllegalArgumentException(
                "O número máximo permitido para long é 20."
            );
        }

        // Caso base
        if (n == 0 || n == 1) {
            return 1;
        }

        // Chamada recursiva
        return n * fatorial(n - 1);
    }

    // Calcula Fibonacci com validação e memorização
    static long fibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                "Fibonacci não aceita números negativos."
            );
        }

        if (n > 92) {
            throw new IllegalArgumentException(
                "O resultado ultrapassa o limite do tipo long."
            );
        }

        long[] memoria = new long[n + 1];

        return fibonacciRecursivo(n, memoria);
    }

    private static long fibonacciRecursivo(
        int n, long[] memoria
    ) {

        // Casos base
        if (n <= 1) {
            return n;
        }

        // Verifica se o resultado já foi calculado
        if (memoria[n] != 0) {
            return memoria[n];
        }

        // Calcula e armazena o resultado
        memoria[n] = fibonacciRecursivo(n - 1, memoria)
                   + fibonacciRecursivo(n - 2, memoria);

        return memoria[n];
    }

    public static void main(String[] args) {

        System.out.println("Fatorial de 5: " + fatorial(5));
        System.out.println("Fatorial de 10: " + fatorial(10));

        System.out.print("Fibonacci (10 termos): ");

        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();

        // Teste de validação
        try {
            System.out.println("Fatorial de -5: " + fatorial(-5));

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
