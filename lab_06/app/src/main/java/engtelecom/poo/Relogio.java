package engtelecom.poo;

import java.awt.Color;
import java.util.ArrayList;

import edu.princeton.cs.algs4.Draw;

public class Relogio {
    private int horas;
    private int minutos;
    private int segundos;
    private ArrayList<Display> displays;
    private double tamanho;

    public Relogio(int horas, int minutos, int segundos, double x, double y, double tamanho) {
        this.displays = new ArrayList<>();

        if (horas >= 0 && horas <= 24 &&
                minutos >= 0 && minutos <= 60 &&
                segundos >= 0 && segundos <= 60) {
                this.horas = horas;
                this.minutos = minutos;
                this.segundos = segundos;
        } else {
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }

        if (tamanho < 1 || tamanho > 3){
            this.tamanho = 2;
        } else {
            this.tamanho = tamanho;
        }

        double t = this.tamanho * 50;

        this.displays.add(new Display(x, y, this.tamanho));
        this.displays.add(new Display(x + (1.5 * t), y, this.tamanho));

        this.displays.add(new Display(x + (3.5 * t), y, this.tamanho));
        this.displays.add(new Display(x + (5.0 * t), y, this.tamanho));

        this.displays.add(new Display(x + (7.0 * t), y, this.tamanho));
        this.displays.add(new Display(x + (8.5 * t), y, this.tamanho));

        ligarDisplay();
    }

    public void ligarDisplay() {
        displays.get(0).setNum(this.horas / 10);
        displays.get(1).setNum(this.horas % 10);

        displays.get(2).setNum(this.minutos / 10);
        displays.get(3).setNum(this.minutos % 10);

        displays.get(4).setNum(this.segundos / 10);
        displays.get(5).setNum(this.segundos % 10);
    }

    public void desenhar(Draw desenho, Color cor){
        displays.forEach(e -> {
            e.desenhar(desenho, cor);
        });
    }

    public void atualizarTempo(){
        this.segundos ++;

        if (this.segundos == 60){
            this.segundos = 0;
            this.minutos ++;

            if (this.minutos == 60){
                this.minutos = 0;
                this.horas++;

                if (this.horas == 24){
                    this.horas = 0;
                }
            }
        }
    
        ligarDisplay();
    }

}
