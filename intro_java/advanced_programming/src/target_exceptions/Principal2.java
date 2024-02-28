package target_exceptions;

public class Principal2 {
    
    public static void main(String[] args) {
        
        try {
            
            throw new ExcecaoCustomizada("Minha Exceção");
        } catch (ExcecaoCustomizada excecaoCustomizada) {
            System.out.println("Ocorreu uma excecao");
            System.out.println(excecaoCustomizada.getMessage());
        }
    }
}
