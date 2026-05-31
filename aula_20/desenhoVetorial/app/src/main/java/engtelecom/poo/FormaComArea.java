package engtelecom.poo;

public abstract class FormaComArea extends FormaGeometrica {
    protected String corDePreenchimento;

    public FormaComArea(String corLinha, Ponto pontoInicial, String corDePreenchimento) {
        super(corLinha, pontoInicial);
        this.corDePreenchimento = corDePreenchimento;
    }

    public abstract String calcularArea();

    public abstract String calcularPerimetro();
}
