package Repetição;
import java.util.Scanner;

/**
 * Exercício 04 - Números primos
 * Leia um número N e exiba todos os números primos de 2 até N.
 */
public class Repeticao04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Exibir primos até: ");
            int limite = sc.nextInt();

            for (int numero = 2; numero <= limite; numero++) {
                boolean primo = true;
                for (int d = 2; d * d <= numero; d++) {
                    if (numero % d == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) System.out.print(numero + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}