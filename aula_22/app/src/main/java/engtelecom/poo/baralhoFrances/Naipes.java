package engtelecom.poo.baralhoFrances;

public enum Naipes {

    OUROS(1, "ouros"),
    ESPADAS(2, "espadas"),
    COPAS(3, "copas"),
    PAUS(4, "paus");
    

    public final int codigo;
    public final String extenso;

    private Naipes(int codigo, String extenso){
        this.codigo = codigo;
        this.extenso = extenso;
    }

    public static Naipes getByCode(int code){
        for (Naipes naipe : Naipes.values()){
            if (naipe.codigo == code){
                return naipe;
            }
        }

        throw new IllegalArgumentException("código inválido.");
    }

    @Override
    public String toString(){
        return extenso;
    }

}
