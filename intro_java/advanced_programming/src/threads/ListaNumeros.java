package threads;

public class ListaNumeros {
    
    // 1 - Sem ser sincronizada
    // 2 - Sincronizada

    synchronized void printTable(int n){
        for (int i = 1; i <= 4; i++) {
            System.out.println(n + 1);
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
