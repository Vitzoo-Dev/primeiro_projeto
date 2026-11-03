package Métodos;
/**
 * Exercício 01 - Métodos básicos
 * Crie métodos para somar, subtrair, multiplicar e dividir dois números.
 */
public class Métodos01 {

    static double somar(double a, double b) {
        return a + b;
    }

    static double subtrair(double a, double b) {
        return a - b;
    }

    static double multiplicar(double a, double b) {
        return a * b;
    }

    static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("10 + 5 = " + somar(10, 5));
        System.out.println("10 - 5 = " + subtrair(10, 5));
        System.out.println("10 * 5 = " + multiplicar(10, 5));
        System.out.println("10 / 5 = " + dividir(10, 5));
    }
}