package threads;

public class Principal3 {
    public static void main(String[] args) {
        ListaNumeros listaNumeros = new ListaNumeros();
        ThreadEstendida1 minhaThread_1 = new ThreadEstendida1(listaNumeros);
        ThreadEstendida2 minhaThread_2 = new ThreadEstendida2(listaNumeros);
        minhaThread_1.start();
        minhaThread_2.start();
    }
}
