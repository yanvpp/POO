package engtelecom.poo;

import java.awt.Color;
import edu.princeton.cs.algs4.Draw;

public class Segmento {
    private boolean ligado;
    private double[] x;
    private double[] y;

    public Segmento(double[] x, double[] y) {
        this.x = x;
        this.y = y;
        this.ligado = false;
    }

    public void switcher(boolean ligado) {
        this.ligado = ligado;
    }

    public void desenhar(Draw desenho, Color cor) {
        if (this.ligado) {
            desenho.setPenColor(cor);
        } else {
            Color escura = new Color((int) (cor.getRed() * 0.2),
                                     (int) (cor.getGreen() * 0.2),
                                     (int) (cor.getBlue() * 0.2));

            desenho.setPenColor(escura);
        }
        desenho.filledPolygon(x, y);
    }
}
