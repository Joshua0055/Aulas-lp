package Aulas;

public class testMetodo {
    public static int qualChapaTemMaisVotos(Voto[] votos){
        int votosChapa1 = 0;
        int votosChapa2 = 0;
        int votosChapa3 = 0;

        for (int k = 0; k < votos.length; k++){
            if (votos[k].getnumChapa()==1){
                votosChapa1++;
            } else if (votos[k].getnumChapa()==2){
                votosChapa2++;
            } else if (votos[k].getnumChapa()==3){
                votosChapa3++;
            }
        }
        if (votosChapa1>votosChapa2 && votosChapa1>votosChapa3){
            return 1;
        } else if(votosChapa2>votosChapa1 && votosChapa2>votosChapa3){
            return 2;
        } else if(votosChapa3>votosChapa1 && votosChapa3>votosChapa2){
            return 3;
        } else{
            return -1;
        }
    }
}
