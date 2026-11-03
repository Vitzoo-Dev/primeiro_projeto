package Métodos;
/**
 * Exercício 02 - Recursão
 * Implemente fatorial e Fibonacci de forma recursiva.
 */
public class Métodos02 {

    static long fatorial(int n) {
        if (n <= 1) return 1;
        return n * fatorial(n - 1);
    }

    static long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fatorial de 5: " + fatorial(5));
        System.out.println("Fatorial de 10: " + fatorial(10));

        System.out.print("Fibonacci (10 termos): ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}
