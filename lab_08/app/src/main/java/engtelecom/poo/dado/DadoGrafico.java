package engtelecom.poo.dado;

import edu.princeton.cs.algs4.Draw;

public class DadoGrafico extends Dado{
    private double x;
    private double y;
    private String caminho;

    public DadoGrafico(int valor, double x, double y) {
        super(valor);
        this.x = x;
        this.y = y;
        caminho = "dados/" + valor + ".png";
    }

    public void desenhar(Draw draw) {
        draw.picture(x, y, caminho);
    }
}
