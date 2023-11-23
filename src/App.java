import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Users\\famil\\OneDrive\\Documentos\\JAVA\\teste\\src\\in.txt";
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
        
        functions.leArqVendas(func);
    }
}
