public class vendedor extends funcionario{
    private double venda;
    private double percentToVenda;

    
    public void setPercentToVenda(double percentToVenda) {
        this.percentToVenda = percentToVenda;
    }
    public double getPercentToVenda() {
        return percentToVenda;
    }
    public double getVenda() {
        return venda;
    }
    public void setVenda(double venda) {
        this.venda = venda;
        this.percentToVenda = 0.3 * venda;
    }
    
    public vendedor(String name) {
        super(name);
        setSalario(12000);
    }

    
}
