package threads;

public class MinhaRunnable implements Runnable {
    
    @Override
    public void run() {

        for (int i = 1; i < 10; i++) {
            System.out.println("MinhaRunnable executando para o Nome do Tópico: " + Thread.currentThread().getName());
            
        }
    }
}
