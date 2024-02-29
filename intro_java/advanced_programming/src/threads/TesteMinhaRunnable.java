package threads;

public class TesteMinhaRunnable {
    public static void main(String[] args) {
        MinhaRunnable teste = new MinhaRunnable();

        Thread t1 = new Thread(teste);
        t1.setName("Teste-1 Thread");
        t1.start();

        Thread t2 = new Thread(teste);
        t2.setName("Teste-2 Thread");
        t2.start();
    }
}
