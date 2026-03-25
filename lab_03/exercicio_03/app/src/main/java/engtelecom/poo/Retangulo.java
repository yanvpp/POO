package engtelecom.poo;

public class Retangulo {
    private String codificacao;
    private int altura;
    private int largura;

    public Retangulo(String codificacao, int altura, int largura) {
        setCodificacao(codificacao);
        setAltura(altura);
        setLargura(largura);
    }

    public String getCodificacao() {
        return codificacao;
    }

    public void setCodificacao(String codificacao) {
        String s = codificacao.toLowerCase();

        if (s.equals("ascii") || s.equals("utf-8")) {
            this.codificacao = codificacao;
        } else
            this.codificacao = "ASCII";
    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if (altura <= 0) {
            this.altura = 3;
            return false;
        } else
            this.altura = altura;
        return true;
    }

    public int getLargura() {
        return largura;
    }

    public boolean setLargura(int largura) {
        if (largura <= 0) {
            this.largura = 4;
            return false;
        } else
            this.largura = largura;
        return true;
    }

    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        String cod = codificacao.toLowerCase();

        String quinaES = (cod.equals("ascii")) ? "+" : "\u250c";
        String quinaDS = (cod.equals("ascii")) ? "+" : "\u2510";
        String quinaEI = (cod.equals("ascii")) ? "+" : "\u2514";
        String quinaDI = (cod.equals("ascii")) ? "+" : "\u2518";
        String linha = (cod.equals("ascii")) ? "-" : "\u2500";
        String coluna = (cod.equals("ascii")) ? "|" : "\u2502";
        String espaco = " ";

        String cima = quinaES + linha.repeat(largura - 2) + quinaDS + "\n";
        String meio = coluna + espaco.repeat(largura - 2) + coluna + "\n";
        String baixo = quinaEI + linha.repeat(largura - 2) + quinaDI;

        return cima + meio.repeat(altura - 2) + baixo;
    }
}
