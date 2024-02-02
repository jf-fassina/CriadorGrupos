
public class Separador {

public static int getSeparador(Main criadorDeGrupos) {
        // Obter os estados dos botões da instância de CriadorDeGrupos
        boolean estadoBotaoAlunos = criadorDeGrupos.getBotAlunos();
        boolean estadoBotaoGrupos = criadorDeGrupos.getBotGrupos();

        /*Vê se o botão alunos ou grupos está selecionado
            * devolve 1 se Alunos se alunos estiver selecionado
            * devolve 2 se Grupos se Grupos estiver selecionado
            * devolve 0 de nenhum estiver selecionado (erro)
         */
        int selecionado;

        if (estadoBotaoAlunos) {
            selecionado = 1;
        } else if (estadoBotaoGrupos) {
            selecionado = 2;
        } else {
            selecionado = 0;
        }

        return selecionado;
    }


    public static void main(String[] args) { }
}
