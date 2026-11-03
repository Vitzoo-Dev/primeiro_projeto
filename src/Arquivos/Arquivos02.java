package Arquivos;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Exercício 02 - Ler arquivo
 * Crie um arquivo de exemplo e leia seu conteúdo linha a linha.
 */
public class Arquivos02 {
    public static void main(String[] args) {
        Path arquivo = Paths.get("exemplo.txt");

        try {
            Files.write(arquivo, List.of("Primeira linha", "Segunda linha", "Terceira linha"));

            try (BufferedReader reader = Files.newBufferedReader(arquivo)) {
                String linha;
                int numero = 1;
                while ((linha = reader.readLine()) != null) {
                    System.out.println(numero++ + ": " + linha);
                }
            }

            Files.deleteIfExists(arquivo);
        } catch (IOException e) {
            System.out.println("Erro de E/S: " + e.getMessage());
        }
    }
}