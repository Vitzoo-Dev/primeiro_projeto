import java.util.Scanner;
import java.util.Locale;

/**
 * Exercício 04 - Área e perímetro
 * Leia o raio de um círculo e calcule área e perímetro.
 * Depois leia base e altura de um retângulo e calcule área e perímetro.
 */
public class Basico04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Raio do círculo: ");
            double raio = sc.nextDouble();
            System.out.printf("Área: %.2f | Perímetro: %.2f%n",
                    Math.PI * raio * raio, 2 * Math.PI * raio);

            System.out.print("Base do retângulo: ");
            double base = sc.nextDouble();
            System.out.print("Altura do retângulo: ");
            double altura = sc.nextDouble();
            System.out.printf("Área: %.2f | Perímetro: %.2f%n",
                    base * altura, 2 * (base + altura));
            sc.close();
        }
    }
}