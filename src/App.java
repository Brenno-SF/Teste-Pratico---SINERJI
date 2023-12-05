import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Users\\famil\\OneDrive\\Documentos\\JAVA\\teste\\src\\in.txt"; //Trocar diretorios para teste
        String cargo;
        
        ArrayList<funcionario> func = new ArrayList<>();//lista com todos os funcionarios
        ArrayList<funcionario> funcB = new ArrayList<>();//lista com apenas funcionarios que recebem beneficios 
        
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
                        funcB.add(s);
                        break;
                        
                    case "Vendedor":
                        v = new vendedor(space[1]);
                        v.setDataAdmissao(space[2]);
                        dataAd = sdf.parse(v.getDataAdmissao());
                        func.add(v);
                        funcB.add(v);
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
            double maiorValor;
            double beneficioTotal;
            String maiorBeneficio;
            while (line != null) {
                String[] space = line.split(", ");

                dataV = sdf.parse(space[0]);
                

                valorTotal=functions.valorTotal(func, dataV.getMonth(),dataV.getYear());//metodo que retorna o valor total
                salarioTotal=functions.salarioTotal(func, dataV.getMonth(),dataV.getYear());//metodo que retorna o total apenas dos salarios
                beneficioTotal = functions.salarioBen(funcB, dataV.getMonth(), dataV.getYear());//metodo que retorna o valor total em beneficios
                maiorValor = functions.maiorValor(func, dataV.getMonth(), dataV.getYear());//metodo que retorna o valor maior
                maiorBeneficio = functions.maiorBen(funcB, dataV.getMonth(), dataV.getYear());// metodo que retorna o nome do funcionario que recebeu o maior valor em beneficio

                System.out.printf("--Valores referentes ao mes %d--\n" +
                    "Valor total: %.2f\n" +
                    "Somente Salario: %.2f\n" +
                    "Valor em Beneficio: %.2f\n" +
                    "Maior valor por funcionario: %.2f\n"+
                    "Funcionario que recebeu o valor maior em beneficio: %s\n",
                    (dataV.getMonth() + 1), valorTotal, salarioTotal, beneficioTotal, maiorValor, maiorBeneficio);
                
                System.out.println();
                line = br.readLine(); 
            }
           
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        

    }
}
