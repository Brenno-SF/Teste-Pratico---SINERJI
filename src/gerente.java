public class gerente extends funcionario {
    
    public gerente(String name) {
        super(name);
        setSalario(20000);
        setBonus(3000);
        setBeneficio(0);
        setSalarioCBen(getSalario());
    }
}
