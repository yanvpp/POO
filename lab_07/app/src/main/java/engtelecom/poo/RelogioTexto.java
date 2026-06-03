package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.awt.Font;

public class RelogioTexto extends RelogioDigital {

    private int tamanhoFonte;
    private Color cor;
    private Font fonte;

    public RelogioTexto(double x, double y, Modos modo, int tamanhoFonte, Color cor) {
        super(x, y, modo);
        setFonte(tamanhoFonte);
        this.cor = cor;
    }



    public RelogioTexto(int hora, int min, int sec, double x, double y, Modos modo, int tamanhoFonte, Color cor) {
        super(hora, min, sec, x, y, modo);
        setFonte(tamanhoFonte);
        this.cor = cor;
    }

    private void setFonte(int tamanho) {
        this.tamanhoFonte = Math.max(10, Math.min(40, tamanho));
        this.fonte = new Font("Monospaced", Font.BOLD, this.tamanhoFonte);
    }

    @Override
    public void desenhar(Draw desenho) {
        desenho.setPenColor(cor);
        desenho.setFont(fonte);
        String texto = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        desenho.textLeft(x, y, texto);
    }
}
