import java.util.Scanner;
import java.util.Locale;

/**
 * Exercício 03 - Índice de Massa Corporal (IMC)
 * Leia peso (kg) e altura (m), calcule o IMC e exiba a classificação.
 */
public class Condicionais03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            System.out.print("Altura (m): ");
            double altura = sc.nextDouble();

            double imc = peso / (altura * altura);
            String classificacao;

            if (imc < 18.5) {
                classificacao = "Abaixo do peso";
            } else if (imc < 25) {
                classificacao = "Peso normal";
            } else if (imc < 30) {
                classificacao = "Sobrepeso";
            } else {
                classificacao = "Obesidade";
            }

            System.out.printf("IMC: %.2f - %s%n", imc, classificacao);
            sc.close();
        }
    }
}