package Exceções;
import java.util.Scanner;

/**
 * Exercício 01 - try/catch básico
 * Leia dois inteiros e divida-os, tratando divisão por zero e entrada inválida.
 */
public class Excecoes01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Dividendo: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Divisor: ");
            int b = Integer.parseInt(sc.nextLine());

            System.out.println("Resultado: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");
        } catch (NumberFormatException e) {
            System.out.println("Erro: digite apenas números inteiros.");
        }
    }
}