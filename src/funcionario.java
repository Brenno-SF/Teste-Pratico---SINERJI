

public abstract class funcionario{
    private String name;
    private double salario;
    private String dataAdmissao;
    private double bonus;
    private double SalarioCBen;
    private double venda;
    private double beneficio;

    
    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }

    public double getSalarioCBen() {
        return SalarioCBen;
    }

    public void setSalarioCBen(double salarioCBonus) {
        SalarioCBen = salarioCBonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

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
        return "funcionario [name=" + name + ", salario=" + salario + ", dataAdmissao=" + dataAdmissao + ", bonus="
                + bonus + ", SalarioCBen=" + SalarioCBen + ", venda=" + venda + "]";
    }

    

   
   
    
}
