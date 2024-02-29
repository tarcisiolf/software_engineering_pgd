package threads;

public class Principal2 {

    public static void main(String[] args) {
        
        MinhaThread3 minhaThread3 = new MinhaThread3();
        Thread thread = new Thread(minhaThread3);
        thread.start();
        System.out.println("Thread Principal");
    }
}
