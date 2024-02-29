package threads;

public class Principal4 {
    public static void main(String[] args) {
        MinhaClasseComum minhaClasseComum = new MinhaClasseComum();
        MinhaThread4 minhaThread_1 = new MinhaThread4(minhaClasseComum, "welcome");
        MinhaThread4 minhaThread_2 = new MinhaThread4(minhaClasseComum, "new");
        MinhaThread4 minhaThread_3 = new MinhaThread4(minhaClasseComum, "programmer");

    }
}
