import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Users\\famil\\OneDrive\\Documentos\\JAVA\\teste\\src\\in.txt"; //Trocar diretoríos para teste
        String cargo;
        
        ArrayList<funcionario> func = new ArrayList<>();
        
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
                        funcionario g = new gerente(space[1]);
                        g.setDataAdmissao(space[2]);
                        dataAd = sdf.parse(g.getDataAdmissao());
                        func.add(g);
                        break;
                        
                    case "Secretario":
                        funcionario s = new secretario(space[1]);
                        s.setDataAdmissao(space[2]);
                        dataAd = sdf.parse(s.getDataAdmissao());
                        func.add(s);
                        break;
                        
                    case "Vendedor":
                        funcionario v = new vendedor(space[1]);
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
        
        path = "C:\\Users\\famil\\OneDrive\\Documentos\\JAVA\\teste\\src\\sales.txt"; //Trocar diretoríos para teste
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {//ler arquivos de vendas

            SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
            Date dataV = new Date();
            String line = br.readLine();
            line = br.readLine();

            double valorTotal = 0;
            while (line != null) {
                
                String[] space = line.split(", ");

                dataV = sdf.parse(space[0]);

                for (funcionario f : func) {
                    dataAd = sdf.parse(f.getDataAdmissao());
                    valorTotal+=functions.valorTotal(func, dataAd.getMonth(),dataAd.getYear(), dataV.getMonth(), dataV.getYear(), f.getSalarioCBonus());//metodo que retorna o valor total
                }
                System.out.println("valor total do mes "+(dataV.getMonth()+1) +": "+  valorTotal);
                line = br.readLine(); 
            }
           
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        

    }
}
