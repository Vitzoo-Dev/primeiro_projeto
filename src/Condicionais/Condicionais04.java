package Condicionais;
import java.util.Scanner;

/**
 * Exercício 04 - Dia da semana
 * Leia um número de 1 a 7 e exiba o dia da semana correspondente (usando switch).
 */
public class Condicionais04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 7: ");
            int dia = sc.nextInt();

            String nome = switch (dia) {
                case 1 -> "Domingo";
                case 2 -> "Segunda-feira";
                case 3 -> "Terça-feira";
                case 4 -> "Quarta-feira";
                case 5 -> "Quinta-feira";
                case 6 -> "Sexta-feira";
                case 7 -> "Sábado";
                default -> "Número inválido";
            };

            System.out.println(nome);
            sc.close();
        }
    }
}