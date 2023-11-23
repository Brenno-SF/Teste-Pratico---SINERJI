public class gerente extends funcionario {
    private double beneficio = 1;
    
    public gerente(String name) {
        super(name);
        setSalario(20000);
        setSalarioCBonus(beneficio*getSalario());
    }
}
