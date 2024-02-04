
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SeparadorDeAlunos {

    public ArrayList<String> separarAlunos() {

        ArrayList<String> listaBase = new ArrayList<>();
        ArrayList<String> separador = new ArrayList<>();
        ArrayList<String> listaSeparada = new ArrayList<>();

        Main criadorDeGrupos = new Main();
        String texto = criadorDeGrupos.getAreaTexto();
        int divisor = criadorDeGrupos.getValorJSpinner();
        
        System.out.println(texto);
        

        String[] items = texto.split("\n");
        listaBase.addAll(Arrays.asList(items));
        //pega o texto da areaTexto e transforma em um arrayList
        System.out.println("split");
        for (int i = 0; i < listaBase.size(); i++) {

            System.out.println(listaBase.get(i));

        }

        Random random = new Random();

        /*
            for (int tamanho = 0; tamanho < numLinhas; tamanho++) {
                System.out.println("sorteador");
                //  SORTEADOR   
                int index = random.nextInt(numLinhas);
                //gera um numero aleatório de 0 ao valor da lista base

                String nome = listaBase.get(index);//pega o nome equivalante ao numero sorteado
                separador.add(nome); //bota o nome em uma lista placehodler
                listaBase.remove(index); //tira o nome da listaBase

            }
         */
        System.out.println("sorteador");
        return listaSeparada;
    }

    public static void main(String[] args) {

    }

}
