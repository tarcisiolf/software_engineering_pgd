package threads;

public class MinhaThread extends Thread {
    public void run(){
        System.out.println("Thread Secundária");
    }

    public static void main(String[] args) {
        MinhaThread minhaThread = new MinhaThread();
        minhaThread.start();
        System.out.println("Thread Principal");
    }
}
