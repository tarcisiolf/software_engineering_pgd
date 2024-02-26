package collections2;

import java.util.HashMap;

public class Principal1 {
    public static void main(String[] args) {
        HashMap<Integer, String> linguagensProgramacao = new HashMap<>();
        linguagensProgramacao.put(1, "C++");
        linguagensProgramacao.put(2, "Java");
        linguagensProgramacao.put(3, "Cobol");

        System.out.println("Conteúdo do HashMap: " + linguagensProgramacao);

        String valor = linguagensProgramacao.get(2);
        System.out.println("Elemento da chave 2: " + valor);

        System.out.println("Chaves: " + linguagensProgramacao.keySet());
        System.out.println("Valores: " + linguagensProgramacao.values());
        System.out.println("Chave/Valor: " + linguagensProgramacao.entrySet());
    }
}
