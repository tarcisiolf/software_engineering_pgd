package target_exceptions;

public class SaldoContaException extends Exception{
    
    private float saldoConta;

    public SaldoContaException(float saldoConta) {
        super();
        this.saldoConta = saldoConta;
    }

    public SaldoContaException(String msg){
        super(msg);
    }

    public float getSaldoConta() {
        return this.saldoConta;
    }
}
