package week2_inheritance;

public class Poupanca extends Conta {
    public void imprimeExtrato() {
        System.out.println("Saldo " + this.getSaldo());
    }
}
