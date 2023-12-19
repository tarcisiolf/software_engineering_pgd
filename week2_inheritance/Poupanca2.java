package week2_inheritance;

public class Poupanca2 implements Conta2 {
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }
}
