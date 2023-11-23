import java.util.ArrayList;

public class functions {

    static double valorTotal(ArrayList<funcionario> func, int mesAd, int anoAd, int mesAtual, int anoAtual, double valor){
        double valorTotal=0;
            if (mesAd == mesAtual && anoAd != anoAtual) { // checarndo se o funcionario está fazendo mais um ano de serviço
                
                valorTotal+=valor; // a ideia aqui é somar todos os salarios, como pede o primeiro metodo
                System.out.println("No mês " + (mesAtual+1));
                System.out.println(valorTotal);
                
            }else{
               
            }

        return valorTotal;
    }
 
}
