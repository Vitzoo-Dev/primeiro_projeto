package Arquivos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

/**
 * Exercício 04 - Copiar arquivo
 * Crie um arquivo de origem, copie-o para um destino e confirme o conteúdo.
 */
public class Arquivos04 {
    public static void main(String[] args) {
        Path origem = Paths.get("origem.txt");
        Path destino = Paths.get("destino.txt");

        try {
            Files.write(origem, List.of("Conteúdo do arquivo original", "Linha 2"));
            Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Conteúdo do arquivo copiado:");
            Files.readAllLines(destino).forEach(l -> System.out.println("  " + l));

            Files.deleteIfExists(origem);
            Files.deleteIfExists(destino);
        } catch (IOException e) {
            System.out.println("Erro de E/S: " + e.getMessage());
        }
    }
}