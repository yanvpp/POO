package engtelecom.poo;

import java.util.ArrayList;
import java.awt.Color;
import edu.princeton.cs.algs4.Draw;

public class RelogioDisplay extends RelogioDigital {

    private ArrayList<Display> displays;
    private double tamanho;
    private Color cor;

    public RelogioDisplay(double x, double y, int tamanho, Modos modo, Color cor) {
        super(x, y, modo);
        this.tamanho = tamanho;
        this.cor = cor;
        montarSegmentos(tamanho);
    }

    public RelogioDisplay(int hora, int min, int sec, double x, double y, double tamanho, Modos modo, Color cor) {
        super(hora, min, sec, x, y, modo);
        this.tamanho = tamanho;
        this.cor = cor;
        montarSegmentos(tamanho);
    }

    private void montarSegmentos(double tamanho) {
        this.displays = new ArrayList<>();
        this.tamanho = (tamanho < 1 || tamanho > 3) ? 2 : tamanho;

        double t = this.tamanho * 50;

        this.displays.add(new Display(x, y, this.tamanho));
        this.displays.add(new Display(x + (1.5 * t), y, this.tamanho));
        this.displays.add(new Display(x + (3.5 * t), y, this.tamanho));
        this.displays.add(new Display(x + (5.0 * t), y, this.tamanho));
        this.displays.add(new Display(x + (7.0 * t), y, this.tamanho));
        this.displays.add(new Display(x + (8.5 * t), y, this.tamanho));

        ligarDisplay();
    }

    private void ligarDisplay() {
        displays.get(0).setNum(this.horas / 10);
        displays.get(1).setNum(this.horas % 10);
        displays.get(2).setNum(this.minutos / 10);
        displays.get(3).setNum(this.minutos % 10);
        displays.get(4).setNum(this.segundos / 10);
        displays.get(5).setNum(this.segundos % 10);
    }

    @Override
    public void desenhar(Draw desenho) {
        ligarDisplay();

        displays.forEach(e -> {
            e.desenhar(desenho, cor);
        });
    }

}
