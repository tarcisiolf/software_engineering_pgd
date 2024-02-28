package working_with_files;

import java.io.Serializable;

public class Aluno implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String nome;
    private int faltas;
    private double nota;

    Aluno () {

    };

    Aluno (String nome, int faltas, double nota) {
        this.nome = nome;
        this.faltas = faltas;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno {" +
                "nome = '" + nome + '\'' +
                ", faltas = " + faltas +
                ", nota = " + nota +
                '}';
    }
}
