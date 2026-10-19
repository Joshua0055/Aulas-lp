package Aulas;
public class testMetodo2 {
    public static boolean verificarSeEstudanteVotou(String codigoPesquisado, Voto [] votos){
        for(int k=0;k<votos.length;k++){
            if (votos[k].getCodigo().equals(codigoPesquisado)){
                return true;
            }
        }
        return false;
    }
}