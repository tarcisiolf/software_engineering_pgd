package target_exceptions;

public class ExcecaoCustomizada extends Exception{

    public ExcecaoCustomizada(String s){
        super(s);
    }


     /*
      * 
      String mensagem;
  
      ExcecaoCustomizada(String str){
          mensagem = str;
       }
  
       public String toString(){
          return ("Exceção Customizada : " + mensagem);
       }

      */
}
