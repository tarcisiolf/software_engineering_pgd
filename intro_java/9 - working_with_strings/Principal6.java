public class Principal6 {
    public static void main(String[] args){

        String nome = "Oswaldo";
        String sobreNome = "Borges";
        String nomeCompleto = nome + sobreNome;
        String nomeComBuffer;

        /*
         * String Builder - Não é protegida nas threads. Elas podem ter
         * acesso a essa string
         */
  
        StringBuilder buffer = new StringBuilder();

        buffer.append(nome);
        buffer.append(sobreNome);

        nomeComBuffer = buffer.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuffer);
    }

}

