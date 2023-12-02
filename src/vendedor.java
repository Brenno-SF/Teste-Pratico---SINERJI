public class vendedor extends funcionario{
    private double venda = 1;// até agora não implementei as vendas, por isso 1
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
    }
    
    public vendedor(String name) {
        super(name);
        setSalario(12000);
        setSalarioCBen(getSalario());
    }

    
}
