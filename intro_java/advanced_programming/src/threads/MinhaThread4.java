package threads;

public class MinhaThread4 extends Thread{
    String mensagem;
    MinhaClasseComum minhaClasseComum;

    MinhaThread4(MinhaClasseComum classeComum, String msg){
        minhaClasseComum = classeComum;
        mensagem = msg;
        start();
    }

    public void run(){
        minhaClasseComum.exibir(mensagem);
    }
}
