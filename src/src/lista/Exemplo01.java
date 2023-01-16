package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo01 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //  list.add(2, "João"); Colocar um elemento em uma determinada posição
        System.out.println(list.size());

        for (String nome : list) {
            System.out.println(nome);
        }

        System.out.println("-----------------------");
        // list.remove("Anna"); Como remover um elemento pelo nome ou pela posição:(3)

        // list.removeIf(x -> x.charAt(0) == 'M'); remove com uma condição
        
        System.out.println("Index of: " + list.indexOf("João")); // Encontra a posição de um elemento na lista
   
        System.out.println("------------------");
       
        // Cria uma nova lista com valores que atenda uma determinada condição:
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        
        for(String r : result){
            System.out.println(r);
        }

        System.out.println("---------------------");
        
        String nome = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
        
        System.out.println(nome);

    }
}
