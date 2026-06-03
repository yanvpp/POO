package engtelecom.poo;

public abstract class RelogioDigital extends Relogio {

    protected Modos modo;

    public RelogioDigital(double x, double y, Modos modo) {
        super(x, y);
        this.modo = modo;
    }

    public RelogioDigital(int hora, int min, int sec, double x, double y, Modos modo) {
        super(hora, min, sec, x, y);
        this.modo = modo;
    }

    protected void reverse() {
        if (horas == 0 && minutos == 0 && segundos == 0) {
            return;
        }

        segundos--;
        if (segundos < 0) {
            segundos = 59;
            minutos--;
            if (minutos < 0) {
                minutos = 59;
                horas--;
                if (horas < 0) {
                    return;
                }
            }
        }
    }

    @Override
    public void atualizarTempo() {
        if (modo == Modos.CRONO_REG) {
            reverse();
        } else {
            avancarTempo();
        }
    }
}
