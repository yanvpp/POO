package engtelecom.poo.baralhoFrances;

public class Carta {
    Naipes naipe;
    Valores valor;

    public Carta(Valores valor, Naipes naipe){
        this.valor = valor;
        this.naipe = naipe;
    }

    @Override
    public String toString(){
        return String.format("""
                %s de %s
                """, valor, naipe);
    }
}
