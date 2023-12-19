package week2_polymorphism;

public class Desenho {
    public void mostrar() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }

    public void mostar(char simb) {
        for (int i = 0; i < 10; i++) {
            System.out.println(simb);
        }
    }

    public void mostar(char simb, int lim) {
        for (int i = 0; i < lim; i++) {
            System.out.println(simb);
        }
    }
}
