package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

public class RelogioAnalogico extends Relogio {

    private double raio;

    public RelogioAnalogico(double x, double y) {
        super(x, y);
        this.raio = 150;
    }

    public RelogioAnalogico(int hora, int min, int sec, double x, double y) {
        super(hora, min, sec, x, y);
        this.raio = 150;
    }

    @Override
    public void atualizarTempo() {
        avancarTempo();
    }

    @Override
    public void desenhar(Draw desenho) {
        double ponteiroHora = raio * 0.5;
        double ponteiroMinuto = raio * 0.8;
        double ponteiroSegundo = raio * 0.8;
        double raioInicio = raio * 0.85;
        double raioFim = raio * 0.95;

        desenho.setPenColor(Draw.WHITE);
        desenho.filledCircle(x, y, raio);

        desenho.setPenColor(Draw.BLACK);
        desenho.setPenRadius(0.01);

        for (int i = 0; i < 12; i++) {
            double angulo = Math.toRadians(30 * i);
            desenho.line(x + raioFim * Math.sin(angulo), y + raioFim * Math.cos(angulo),
                    x + raioInicio * Math.sin(angulo), y + raioInicio * Math.cos(angulo));
        }

        double anguloHora = Math.toRadians(30 * horas);
        double anguloMinuto = Math.toRadians(6 * minutos);
        double anguloSegundo = Math.toRadians(6 * segundos);

        desenho.setPenRadius(0.015);
        desenho.line(x, y, x + ponteiroHora * Math.sin(anguloHora), y + ponteiroHora * Math.cos(anguloHora));

        desenho.setPenRadius(0.01);
        desenho.line(x, y, x + ponteiroMinuto * Math.sin(anguloMinuto), y + ponteiroMinuto * Math.cos(anguloMinuto));

        desenho.setPenRadius(0.005);
        desenho.setPenColor(Draw.RED);
        desenho.line(x, y, x + ponteiroSegundo * Math.sin(anguloSegundo), y + ponteiroSegundo * Math.cos(anguloSegundo));
    }

}
