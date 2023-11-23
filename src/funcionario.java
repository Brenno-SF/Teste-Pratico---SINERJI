

public abstract class funcionario{
    private String name;
    private double salario;
    private String dataAdmissao;
    
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public funcionario(String name) {
        this.name = name;
    }
   
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "funcionario [name=" + name + ", salario=" + salario + ", dataAdmissao=" + dataAdmissao + "]";
    }

    
    
}
