package engtelecom.poo.baralhoFrances;

public enum Naipes {

    OUROS(1, "ouros", 'o'),
    ESPADAS(2, "espadas", 'e'),
    COPAS(3, "copas", 'c'),
    PAUS(4, "paus", 'p');
    

    public final int codigo;
    public final String extenso;
    public final char inicial;

    private Naipes(int codigo, String extenso, char inicial){
        this.codigo = codigo;
        this.extenso = extenso;
        this.inicial = inicial;
    }

    public static Naipes getByCode(int code){
        for (Naipes naipe : Naipes.values()){
            if (naipe.codigo == code){
                return naipe;
            }
        }

        throw new IllegalArgumentException("código inválido.");
    }

    public char getNaipe(){
        return inicial;
    }

    @Override
    public String toString(){
        return extenso;
    }

}
