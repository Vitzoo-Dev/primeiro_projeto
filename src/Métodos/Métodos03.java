package Métodos;
/**
 * Exercício 03 - Sobrecarga de métodos
 * Crie métodos "calcularArea" sobrecarregados para quadrado, retângulo e círculo.
 */
public class Métodos03 {

    static double calcularArea(double lado) {
        return lado * lado;
    }

    static double calcularArea(double base, double altura) {
        return base * altura;
    }

    static double calcularArea(double raio, boolean circulo) {
        return circulo ? Math.PI * raio * raio : 0;
    }

    public static void main(String[] args) {
        System.out.printf("Área do quadrado (lado 4): %.2f%n", calcularArea(4));
        System.out.printf("Área do retângulo (3 x 5): %.2f%n", calcularArea(3, 5));
        System.out.printf("Área do círculo (raio 2): %.2f%n", calcularArea(2, true));
    }
}