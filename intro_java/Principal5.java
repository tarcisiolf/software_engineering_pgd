public class Principal5 {
    
    public static void main(String[] args){

        String nome = "Oswaldo";
        String sobreNome = "Borges";
        String nomeCompleto = nome + sobreNome;
        String nomeComBuffer;

        /*
         * String Buffer - colocar as strings no buffer e 
         * depois cria tudo de uma vez
         */
  
        StringBuffer buffer = new StringBuffer();

        buffer.append(nome);
        buffer.append(sobreNome);

        nomeComBuffer = buffer.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuffer);
    }

}
