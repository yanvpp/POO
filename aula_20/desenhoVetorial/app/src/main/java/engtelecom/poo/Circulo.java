package engtelecom.poo;

public class Circulo extends FormaComArea {

    private double raio;

    public Circulo(String corLinha, Ponto pontoInicial, String corDePreenchimento, double raio) {
        super(corLinha, pontoInicial, corDePreenchimento);
        this.raio = raio;
    }

    @Override
    public String calcularArea() {
        return String.format("Área do círculo: %.2f", Math.PI * Math.pow(raio, 2));
    }

    @Override
    public String calcularPerimetro() {
        return String.format("Perímetro do círculo: %.2f", 2 * Math.PI * raio);
    }

    @Override
    public String desenhar() {
        return String.format("""
                -----------------
                |    CÍRCULO    |
                -----------------

                Cor da linha: %s
                Preenchimento: %s
                Ponto inicial: %s
                Raio: %.2f
                """, corLinha, corDePreenchimento, pontoInicial, raio);
    }

}
