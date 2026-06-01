package engtelecom.poo.baralhoFrances;

public enum Valores {

    AS(1, "Ás"),
    DOIS(2, "dois"),
    TRES(3, "três"),
    QUATRO(4, "quatro"),
    CINCO(5, "cinco"),
    SEIS(6, "seis"),
    SETE(7, "sete"),
    OITO(8, "oito"),
    NOVE(9, "nove"),
    DEZ(10, "dez"),
    VALETE(11, "Valete"),
    DAMA(12, "Dama"),
    REI(13, "Rei");

    public final int valor;
    public final String extenso;

    private Valores(int valor, String extenso){
        this.valor = valor;
        this.extenso = extenso;
    }

    public static Valores getByValor(int valor){
        for (Valores carta : Valores.values()){
            if (carta.valor == valor){
                return carta;
            }
        }

        throw new IllegalArgumentException("valor inválido.");
    }

    @Override
    public String toString(){
        return extenso;
    }

}
