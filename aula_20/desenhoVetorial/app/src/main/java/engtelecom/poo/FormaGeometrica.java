package engtelecom.poo;

public abstract class FormaGeometrica {
    protected String corLinha;
    protected Ponto pontoInicial;
    
    public FormaGeometrica(String corLinha, Ponto pontoInicial){
        this.corLinha = corLinha;
        this.pontoInicial = pontoInicial;
    }

    public abstract String desenhar();
}
