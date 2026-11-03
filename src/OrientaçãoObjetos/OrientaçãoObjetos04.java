package OrientaçãoObjetos;
import java.util.ArrayList;
import java.util.List;

/**
 * Exercício 04 - Interfaces
 * Crie a interface Pagavel e implemente em Funcionario e Fornecedor.
 * Calcule o total a pagar de uma lista de Pagaveis.
 */
interface Pagavel {
    double calcularPagamento();
}

class Funcionario implements Pagavel {
    private final String nome;
    private final double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionário " + nome;
    }
}

class Fornecedor implements Pagavel {
    private final String empresa;
    private final double valorNota;

    public Fornecedor(String empresa, double valorNota) {
        this.empresa = empresa;
        this.valorNota = valorNota;
    }

    @Override
    public double calcularPagamento() {
        return valorNota;
    }

    @Override
    public String toString() {
        return "Fornecedor " + empresa;
    }
}

public class OrientaçãoObjetos04 {
    public static void main(String[] args) {
        List<Pagavel> pagamentos = new ArrayList<>();
        pagamentos.add(new Funcionario("Carlos", 3500));
        pagamentos.add(new Fornecedor("Papelaria XYZ", 1200.50));
        pagamentos.add(new Funcionario("Bia", 4200));

        double total = 0;
        for (Pagavel p : pagamentos) {
            System.out.printf("%s: R$ %.2f%n", p, p.calcularPagamento());
            total += p.calcularPagamento();
        }
        System.out.printf("Total a pagar: R$ %.2f%n", total);
    }
}