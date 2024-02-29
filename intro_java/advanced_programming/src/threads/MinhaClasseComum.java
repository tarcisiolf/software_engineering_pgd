package threads;

public class MinhaClasseComum {
    
    // 1 - Sem ser sincronizada
    // 2 - Sincronizada
    synchronized public void exibir(String msg) {
        System.out.println("[" + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("]");
    }
}
