package engtelecom.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    private static final int HORA_MAXIMA = 23;
    private static final int MIN_SEC_MAX = 59;
    private static final int VALOR_MINIMO = 0;

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public void setHorario(int hora, int minuto, int segundo) {
        if (hora > HORA_MAXIMA || hora < VALOR_MINIMO)
            return;
        if (minuto > MIN_SEC_MAX || minuto < VALOR_MINIMO)
            return;
        if (segundo > MIN_SEC_MAX || minuto < VALOR_MINIMO)
            return;

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setHorario(int hora, int minuto) {
        setHorario(hora, minuto, 0);
    }

    public void setHorario(int hora) {
        setHorario(hora, 0, 0);
    }
}
