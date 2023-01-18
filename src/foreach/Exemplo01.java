package foreach;

public class Exemplo01 {

    public static void main(String[] args) {

        String[] vetorNomes;
        vetorNomes = new String[]{"Maria", "Bob", "Dan"};

        for (int i = 0; i < vetorNomes.length; i++) {
            System.out.println(vetorNomes[i]);
        }
        
        System.out.println("-----------");
        
        for(String nomeVetor : vetorNomes){
            System.out.println(nomeVetor);
        }
    }
}
