public class secretario extends funcionario{
    
   

    public secretario(String name) {
        super(name);
        setSalario(7000);
        setBonus(1000);
        setBeneficio(getSalario()*0.2);
        setSalarioCBen(getBeneficio() + getSalario());
    }
}
