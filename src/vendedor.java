public class vendedor extends funcionario{
    
    
    public vendedor(String name) {
        super(name);
        setSalario(12000);
        setBeneficio(getVenda() * 0.3);
        setSalarioCBen(getBeneficio() + getSalario());
    }

    
}
