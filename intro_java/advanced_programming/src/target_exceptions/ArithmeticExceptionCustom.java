package target_exceptions;

public class ArithmeticExceptionCustom extends ArithmeticException {
    String mensagem;

    ArithmeticExceptionCustom(){
        super("Minha Arithmetic Exception");
    }
}
