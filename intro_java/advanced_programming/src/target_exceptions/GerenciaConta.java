package target_exceptions;

import java.util.Scanner;

public class GerenciaConta {
    private float saldoAtual = 15000f;
    public static void main(String[] args) {

    Scanner inputDevice = new Scanner(System.in);
    System.out.print("Por favor, insira um valor acrescentado no seu saldo: ");
    float novoValor = inputDevice.nextFloat();

    try {

        float valorTotal = new GerenciaConta().AdicionaValor(novoValor); 
        System.out.println("Valor total da conta = " + valorTotal);
    } catch (SaldoContaException a) {

        float fdAmount = a.getSaldoConta() - 20000;
        System.out.println("Agora, o saldo da sua conta é superior a 20.000, criando um FD de quantia: " + fdAmount);
        new GerenciaConta().criaDepositoFixo (fdAmount);
        System.out.println("Valor da conta = " + 20000);
    }
}

    public float AdicionaValor(float montante) throws SaldoContaException {
        float total = saldoAtual + montante;

        if (total > 20000) {
            throw new SaldoContaException(total);
        }
        return total;
    }

    public void criaDepositoFixo (float valorFixo){
    // Implimentationof FD creation
    }
    
}
