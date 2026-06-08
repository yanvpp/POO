package engtelecom.poo.baralhoFrances;

public enum Valores {

    AS(1, "Ás", "1"),
    DOIS(2, "dois", "2"),
    TRES(3, "três", "3"),
    QUATRO(4, "quatro", "4"),
    CINCO(5, "cinco", "5"),
    SEIS(6, "seis", "6"),
    SETE(7, "sete", "7"),
    OITO(8, "oito", "8"),
    NOVE(9, "nove", "9"),
    DEZ(10, "dez", "10"),
    DAMA(11, "Dama", "q"),
    VALETE(12, "Valete", "j"),
    REI(13, "Rei", "k");

    public final int valor;
    public final String extenso;
    public final String inicial;

    private Valores(int valor, String extenso, String inicial){
        this.valor = valor;
        this.extenso = extenso;
        this.inicial = inicial;
    }

    public static Valores getByValor(int valor){
        for (Valores carta : Valores.values()){
            if (carta.valor == valor){
                return carta;
            }
        }

        throw new IllegalArgumentException("valor inválido.");
    }

    public String getValor(){
        return inicial;
    }

    @Override
    public String toString(){
        return extenso;
    }

}
