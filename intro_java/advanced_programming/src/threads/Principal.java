package threads;

public class Principal {
    public static void main(String[] args) {
        MinhaThread2 minhaThread2 = new MinhaThread2();
        minhaThread2.start();
        System.out.println("Thread Principal");
    }
}
