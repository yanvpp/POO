package engtelecom.poo;

import java.time.LocalTime;

import edu.princeton.cs.algs4.Draw;

public abstract class Relogio {
    protected int horas;
    protected int minutos;
    protected int segundos;
    protected double x;
    protected double y;

    public Relogio(double x, double y) {
        this.x = x;
        this.y = y;
        LocalTime now = LocalTime.now();
        this.horas = now.getHour();
        this.minutos = now.getMinute();
        this.segundos = now.getSecond();
    }

    public Relogio(int hora, int min, int sec, double x, double y) {
        if (hora >= 0 && hora < 24 && min >= 0 && min < 60 && sec >= 0 && sec < 60) {
            this.x = x;
            this.y = y;
            this.horas = hora;
            this.minutos = min;
            this.segundos = sec;
        }
    }

    protected void avancarTempo() {
        this.segundos++;
        if (this.segundos == 60) {
            this.segundos = 0;
            this.minutos++;
            if (this.minutos == 60) {
                this.minutos = 0;
                this.horas++;
                if (this.horas == 24) {
                    this.horas = 0;
                }
            }
        }
    }

    public abstract void atualizarTempo();

    public abstract void desenhar(Draw desenho);
}
