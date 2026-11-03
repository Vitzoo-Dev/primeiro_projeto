package Arquivos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Exercício 03 - Contar linhas, palavras e caracteres
 * Crie um arquivo de texto e exiba suas estatísticas.
 */
public class Arquivos03 {
    public static void main(String[] args) {
        Path arquivo = Paths.get("texto.txt");

        try {
            Files.write(arquivo, List.of(
                    "Java é uma linguagem de programação",
                    "orientada a objetos",
                    "muito usada no mundo todo"));

            List<String> linhas = Files.readAllLines(arquivo);
            int palavras = 0, caracteres = 0;

            for (String linha : linhas) {
                caracteres += linha.length();
                if (!linha.isBlank()) {
                    palavras += linha.trim().split("\\s+").length;
                }
            }

            System.out.println("Linhas: " + linhas.size());
            System.out.println("Palavras: " + palavras);
            System.out.println("Caracteres (sem quebras de linha): " + caracteres);

            Files.deleteIfExists(arquivo);
        } catch (IOException e) {
            System.out.println("Erro de E/S: " + e.getMessage());
        }
    }
}