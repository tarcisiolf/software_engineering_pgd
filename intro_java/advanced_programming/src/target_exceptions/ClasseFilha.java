package target_exceptions;

public class ClasseFilha {
    ClasseNeta classeNeta;

    public void executar() throws Exception {
        classeNeta = new ClasseNeta();
        classeNeta.executar();
    }
}
