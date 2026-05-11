package engtelecom.poo.produtos;

public class Dimensao {
    private double altura, largura, profundidade;

    public Dimensao(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "[altura=" + altura + ", largura=" + largura + ", profundidade=" + profundidade + "]";
    }
}
