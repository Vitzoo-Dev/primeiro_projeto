package OrientaçãoObjetos;
/**
 * Exercício 01 - Classes e encapsulamento
 * Crie uma classe ContaBancaria com atributos privados e métodos
 * para depositar, sacar e consultar o saldo.
 */
class ContaBancaria {
    private final String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            System.out.println("Saque não permitido.");
            return false;
        }
        saldo -= valor;
        return true;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class OrientaçãoObjetos01 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ana", 500);
        conta.depositar(250);
        conta.sacar(100);
        conta.sacar(2000);

        System.out.printf("Titular: %s | Saldo: R$ %.2f%n",
                conta.getTitular(), conta.getSaldo());
    }
}