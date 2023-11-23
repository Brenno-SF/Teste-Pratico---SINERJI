public class vendedor extends funcionario{
    private double venda;
    private double beneficio = 0.3;

    
    public void setBeneficio(double percentToVenda) {
        this.beneficio = percentToVenda;
    }
    public double getBeneficio() {
        return beneficio;
    }
    public double getVenda() {
        return venda;
    }
    public void setVenda(double venda) {
        this.venda = venda;
        this.beneficio *= venda;
    }
    
    public vendedor(String name) {
        super(name);
        setSalario(12000);
    }

    
}
