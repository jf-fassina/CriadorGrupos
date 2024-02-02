
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SeparadorDeAlunos {

    ArrayList<String> listaBase = new ArrayList<>();
    ArrayList<String> separador = new ArrayList<>();
    ArrayList<String> listaSeparada = new ArrayList<>();
    
    Main criadorDeGrupos = new Main();
    String texto = criadorDeGrupos.getAreaTexto();
    int divisor = criadorDeGrupos.getValorJSpinner();

    public ArrayList<String> separarAlunos() {

        String[] items = texto.split("\n");
        for (String item : items) {
           listaBase.add(item);
        }
        System.out.println(listaBase);
        
//        listaBase.addAll(Arrays.asList(nomesArray));
        //pega o texto da areaTexto e transforma em um arrayList
        
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
        return listaSeparada;
    }

    public static void main(String[] args) {

    }

}
