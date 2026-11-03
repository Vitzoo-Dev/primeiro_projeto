package Arquivos;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Exercício 01 - Escrever em arquivo
 * Grave uma lista de nomes em um arquivo de texto, um por linha.
 */
public class Arquivos01 {
    public static void main(String[] args) {
        Path arquivo = Paths.get("nomes.txt");
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana"};

        try (BufferedWriter writer = Files.newBufferedWriter(arquivo)) {
            for (String nome : nomes) {
                writer.write(nome);
                writer.newLine();
            }
            System.out.println("Arquivo criado: " + arquivo.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
    }
}