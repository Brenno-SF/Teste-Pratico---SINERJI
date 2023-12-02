public class vendedor extends funcionario{
    private double beneficio = 0.3;

    
    public void setBeneficio(double percentToVenda) {
        this.beneficio = percentToVenda;
    }
    public double getBeneficio() {
        return beneficio;
    }
    
    public vendedor(String name) {
        super(name);
        setSalario(12000);
        setSalarioCBen(getSalario());
    }

    
}
