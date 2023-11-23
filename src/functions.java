import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class functions {

    static void leArqVendas(ArrayList<funcionario> func){
        String path = "C:\\Users\\famil\\OneDrive\\Documentos\\JAVA\\teste\\src\\sales.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {//ler arquivos de vendas

            SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
            Date dataV = new Date();
            String line = br.readLine();
            line = br.readLine();

            while (line != null) {
                
                String[] space = line.split(", ");

                dataV = sdf.parse(space[0]);

                for (funcionario f : func) {
                    Date dataAd = sdf.parse(f.getDataAdmissao());
                    
                    if (dataV.getMonth() == dataAd.getMonth() && dataV.getYear() != dataAd.getYear()) { // checarndo se o funcionario está fazendo mais um ano de serviço
                        System.out.println("ganhou o bonus anual:");
                        System.out.println(f);
                        System.out.println(f.getSalarioCBonus() + f.getBonus());
                        
                    }else{
                        // System.out.println(f);
                        // System.out.println(f.getSalarioCBonus());
                    }
                }

                line = br.readLine(); 
            }
           
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

   
}
