package week2_oop;

public class Main {
    public static void main(String[] args) {
        Cao cachorro = new Cao();
        cachorro.Anda();

        Cao dog = new Cao("Lulu", 12);
        dog.DadosCao();

        Cao2 cachorro2 = new Cao2();
        cachorro2.setIdade(5);

        if (cachorro2.VerificarIdade()) {
            System.out.println("Ele é idoso");
        } else {
            System.out.println("Ele é novinho");
        }
    }
}
