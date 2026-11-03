package Métodos;
/**
 * Exercício 04 - Varargs e verificação de primo
 * Crie um método que some qualquer quantidade de inteiros (varargs)
 * e outro que verifique se um número é primo.
 */
public class Métodos04 {

    static int somar(int... numeros) {
        int total = 0;
        for (int n : numeros) total += n;
        return total;
    }

    static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Soma (1, 2, 3): " + somar(1, 2, 3));
        System.out.println("Soma (10, 20, 30, 40): " + somar(10, 20, 30, 40));

        int[] testes = {1, 2, 7, 10, 13, 25, 29};
        for (int n : testes) {
            System.out.println(n + (ehPrimo(n) ? " é primo" : " não é primo"));
        }
    }
}