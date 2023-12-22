package week2_oop;

public class Cao2 {
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void Andar() {
        System.out.println("Estou andando");
    }

    public boolean VerificarIdade() {
        if (idade > 18) {
            return true;
        }

        else {
            return false;
        }
    }
}
