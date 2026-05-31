package engtelecom.poo;

public class Retangulo extends FormaComArea {
    private double altura;
    private double largura;

    public Retangulo(String corLinha, Ponto pontoInicial, String corDePreenchimento, double altura, double largura) {
        super(corLinha, pontoInicial, corDePreenchimento);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public String calcularArea() {
        return String.format("Área do retângulo: %.2f", altura * largura);
    }

    @Override
    public String calcularPerimetro() {
        return String.format("Perímetro do retângulo: %.2f", (2 * altura) + (2 * largura));
    }

    @Override
    public String desenhar() {
        return String.format("""
                -----------------
                |   RETÂNGULO   |
                -----------------

                Cor da linha: %s
                Preenchimento: %s
                Ponto inicial: %s
                Altura: %.2f
                Largura: %.2f
                """, corLinha, corDePreenchimento, pontoInicial, altura, largura);
    }
}
