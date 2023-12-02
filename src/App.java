import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Users\\famil\\OneDrive\\Documentos\\JAVA\\teste\\src\\in.txt"; //Trocar diretorios para teste
        String cargo;
        
        ArrayList<funcionario> func = new ArrayList<>();
        funcionario g = new gerente(null);
        funcionario s = new secretario(null);
        funcionario v = new vendedor(null);
        
        Date dataAd = new Date();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //ler os nomes, cargos e data de admissão

            SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
            
            String line = br.readLine();
            line = br.readLine();
            
            while (line != null) {
                String[] space = line.split(", ");
                cargo = space[0];
                
                switch (cargo) {
                    case "Gerente":
                        g = new gerente(space[1]);
                        g.setDataAdmissao(space[2]);
                        dataAd = sdf.parse(g.getDataAdmissao());
                        func.add(g);
                        break;
                        
                    case "Secretario":
                        s = new secretario(space[1]);
                        s.setDataAdmissao(space[2]);
                        dataAd = sdf.parse(s.getDataAdmissao());
                        func.add(s);
                        break;
                        
                    case "Vendedor":
                        v = new vendedor(space[1]);
                        v.setDataAdmissao(space[2]);
                        dataAd = sdf.parse(v.getDataAdmissao());
                        func.add(v);
                        break;
                        
                    default:
                        break;
                    }
                    
                    line = br.readLine(); 
                }
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        path = "C:\\Users\\famil\\OneDrive\\Documentos\\JAVA\\teste\\src\\sales.txt"; //Trocar diretorios para teste
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {//ler arquivos de vendas

            SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
            Date dataV = new Date();
            String line = br.readLine();
            line = br.readLine();

            double valorTotal;
            double salarioTotal;
            while (line != null) {
                String[] space = line.split(", ");

                dataV = sdf.parse(space[0]);

                valorTotal=functions.valorTotal(func, dataV.getMonth(),dataV.getYear());//metodo que retorna o valor total
                salarioTotal=functions.salarioTotal(func, dataV.getMonth(),dataV.getYear());//metodo que retorna o total apenas dos salarios

                System.out.printf("--Valores referentes ao mes %d--\nValor total: %.2f\nSomente Salario: %.2f\n",(dataV.getMonth() + 1), valorTotal,salarioTotal);
                System.out.println();
                line = br.readLine(); 
            }
           
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        

    }
}
