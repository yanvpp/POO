package engtelecom.poo;

public class Linha extends FormaGeometrica {
    
    private Ponto pontoFinal;

    public Linha(String corLinha, Ponto pontoInicial, Ponto pontoFinal) {
        super(corLinha, pontoInicial);
        this.pontoFinal = pontoFinal;
    }

    @Override
    public String desenhar() {
        return String.format("""
                -----------------
                |     LINHA     |
                -----------------

                Cor da linha: %s
                Ponto inicial: %s
                Ponto final: %s
                """, corLinha, pontoInicial, pontoFinal);
    }    
}
