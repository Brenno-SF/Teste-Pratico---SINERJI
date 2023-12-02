public class secretario extends funcionario{
    private double beneficio = 0.2;
    
    public double getBeneficio() {
        return beneficio;
    }

    public secretario(String name) {
        super(name);
        setSalario(7000);
        setBonus(1000);
        setSalarioCBen((beneficio*getSalario()) + getSalario());
    }
}
