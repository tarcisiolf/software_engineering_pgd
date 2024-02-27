package advanced_programming.src.working_with_strings;

public class Principal3{
    public static void main(String[] args){

        String nome = "Oswaldo";
        String nomeGuerra = new String("Oswaldo");
        String sobrenome = new String("Oswaldo");

        if(nome.equals(nomeGuerra)){
            System.out.println("Nomes iguais");
        }
        else{
            System.out.println("Nomes diferentes");
        }
        if(nome.equals(sobrenome)){
            System.out.println("Nomes iguais");
        }
        else{
            System.out.println("Nomes diferentes");
        }


      
    }
}