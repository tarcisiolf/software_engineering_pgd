package week2_inheritance;

public class Animal {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void Comer() {
        System.out.println("Eu gosto de comer.");
    }
}
