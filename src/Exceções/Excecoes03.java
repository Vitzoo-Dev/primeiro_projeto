package Exceções;
/**
 * Exercício 03 - Múltiplos catch e finally
 * Provoque diferentes exceções e trate cada uma separadamente.
 * O bloco finally deve ser sempre executado.
 */
public class Excecoes03 {

    static void executar(int cenario) {
        try {
            switch (cenario) {
                case 1 -> {
                    int[] v = new int[3];
                    v[5] = 10;
                }
                case 2 -> Integer.parseInt("abc");
                case 3 -> {
                    String texto = null;
                    texto.length();
                }
                default -> System.out.println("Cenário sem erro.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice inválido do vetor: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Formato numérico inválido: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Referência nula encontrada.");
        } finally {
            System.out.println("Fim do cenário " + cenario + " (finally).\n");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            executar(i);
        }
    }
}