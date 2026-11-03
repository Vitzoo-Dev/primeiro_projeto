package Exceções;
/**
 * Exercício 02 - Exceção personalizada
 * Crie a exceção SaldoInsuficienteException e use-a em um saque de conta.
 */
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                    String.format("Saldo insuficiente. Saldo: %.2f | Saque: %.2f", saldo, valor));
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Excecoes02 {
    public static void main(String[] args) {
        Conta conta = new Conta(300);

        try {
            conta.sacar(100);
            System.out.println("Saque realizado. Saldo: " + conta.getSaldo());
            conta.sacar(500);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}