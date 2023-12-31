import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class functions {

    static double valorTotal(ArrayList<funcionario> func, int mesAtual, int anoAtual) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        double valorTotal = 0;
        for (funcionario f : func) {

            Date dataAd = sdf.parse(f.getDataAdmissao());
            if (dataAd.getMonth() == mesAtual && dataAd.getYear() != anoAtual) { // checando se o funcionario está fazendo mais um ano de serviço
                valorTotal += (f.getSalarioCBen() + f.getBonus()); // a ideia aqui é somar todos os salarios,  como pede o primeiro metodo, neste caso com o bonus anual
                
            }else{
                valorTotal += (f.getSalarioCBen()); // a ideia aqui é somar todos os salarios, como pede o primeiro metodo    
            }
        }

        return valorTotal;
    }
    static double salarioTotal(ArrayList<funcionario> func, int mesAtual, int anoAtual){
        double allSalario = 0;

        for (funcionario f : func) {
            allSalario += f.getSalario();
        }
        return allSalario;
    }

    static double salarioBen(ArrayList<funcionario> funcB, int mesAtual, int anoAtual){
        double beneficio = 0;
        for (funcionario f : funcB) {
            beneficio+=f.getBeneficio();
        }

        return beneficio;
    }
    static double maiorValor(ArrayList<funcionario> func, int mesAtual, int anoAtual) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        double  max = Double.MIN_VALUE;
        
        for (funcionario f : func) {
            
            Date dataAd = sdf.parse(f.getDataAdmissao());
            if (dataAd.getMonth() == mesAtual && dataAd.getYear() != anoAtual) { // checando se o funcionario está fazendo mais um ano de serviço
                if ((f.getSalarioCBen()+f.getBonus()) > max) { //definindo qual maior valor do mês
                    max = f.getSalarioCBen()+f.getBonus();
                }    
            }else{
                if (f.getSalarioCBen() > max) {
                    max = f.getSalarioCBen();
                } 
            }
        }
        
        return max;
    }
    static String maiorBen(ArrayList<funcionario> funcB, int mesAtual, int anoAtual){
        double  max = Double.MIN_VALUE;
        String nome = "";

        for (funcionario f : funcB) {
            if (f.getBeneficio() > max) {
                max = f.getBeneficio();                
                nome = f.getName();
            } 
        }

        return nome;
    }

    String maiorVeda(ArrayList<vendedor> ven, int mesAtual, int anoAtual){
        double max = Double.MAX_VALUE;
        String nome = "";

         for (vendedor v : ven) {
            if (v.getVenda() > max) {
                max = v.getVenda();                
                nome = v.getName();
            } 
        }
        return nome;    
    }
}
