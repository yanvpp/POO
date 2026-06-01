package engtelecom.poo.diasDaSemana;

public enum DiasDaSemana {

    // instâncias da enum, convenção em caixa alta
    DOMINGO(1, "domingo"),
    SEGUNDA(2, "segunda-feira"),
    TERÇA(3, "terça-feira"),
    QUARTA(4, "quarta-feira"),
    QUINTA(5, "quinta-feira"),
    SEXTA(6, "sexta-feira"),
    SABADO(7, "sábado");

    // convenção, atributos sempre public final
    public final int codigo;
    public final String extenso;

    private DiasDaSemana(int codigo, String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }

    public static DiasDaSemana getByCode(int codigo){
        for (DiasDaSemana dia : DiasDaSemana.values()){
            if (dia.codigo == codigo){
                return dia;
            }
        }

        throw new IllegalArgumentException("código inválido.");
    }

    @Override
    public String toString() {
        return extenso;
    }
}
