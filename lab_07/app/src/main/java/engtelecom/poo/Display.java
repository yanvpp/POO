package engtelecom.poo;

import java.awt.Color;
import java.util.ArrayList;

import edu.princeton.cs.algs4.Draw;

public class Display {
    private ArrayList<Segmento> segmentos;

    public Display(double x, double y, double tamanho) {
        this.segmentos = new ArrayList<>();

        if (tamanho < 1 || tamanho > 3) {
            tamanho = 2;
        }

        double t = tamanho * 50;

        double[] xA = { 0.1 * t + x, 0.2 * t + x, 1.0 * t + x, 1.1 * t + x, 1.0 * t + x, 0.2 * t + x };
        double[] yA = { 2.0 * t + y, 2.1 * t + y, 2.1 * t + y, 2.0 * t + y, 1.9 * t + y, 1.9 * t + y };
        this.segmentos.add(new Segmento(xA, yA));

        double[] xB = { 1.0 * t + x, 1.1 * t + x, 1.1 * t + x, 1.0 * t + x, 0.9 * t + x, 0.9 * t + x };
        double[] yB = { 1.1 * t + y, 1.2 * t + y, 1.9 * t + y, 2.0 * t + y, 1.9 * t + y, 1.2 * t + y };
        this.segmentos.add(new Segmento(xB, yB));

        double[] xC = { 1.0 * t + x, 1.1 * t + x, 1.1 * t + x, 1.0 * t + x, 0.9 * t + x, 0.9 * t + x };
        double[] yC = { 0.2 * t + y, 0.3 * t + y, 1.0 * t + y, 1.1 * t + y, 1.0 * t + y, 0.3 * t + y };
        this.segmentos.add(new Segmento(xC, yC));

        double[] xD = { 0.1 * t + x, 0.2 * t + x, 1.0 * t + x, 1.1 * t + x, 1.0 * t + x, 0.2 * t + x };
        double[] yD = { 0.2 * t + y, 0.3 * t + y, 0.3 * t + y, 0.2 * t + y, 0.1 * t + y, 0.1 * t + y };
        this.segmentos.add(new Segmento(xD, yD));

        double[] xE = { 0.1 * t + x, 0.2 * t + x, 0.2 * t + x, 0.1 * t + x, 0.0 * t + x, 0.0 * t + x };
        double[] yE = { 0.2 * t + y, 0.3 * t + y, 1.0 * t + y, 1.1 * t + y, 1.0 * t + y, 0.3 * t + y };
        this.segmentos.add(new Segmento(xE, yE));

        double[] xF = { 0.1 * t + x, 0.2 * t + x, 0.2 * t + x, 0.1 * t + x, 0.0 * t + x, 0.0 * t + x };
        double[] yF = { 1.1 * t + y, 1.2 * t + y, 1.9 * t + y, 2.0 * t + y, 1.9 * t + y, 1.2 * t + y };
        this.segmentos.add(new Segmento(xF, yF));

        double[] xG = { 0.1 * t + x, 0.2 * t + x, 1.0 * t + x, 1.1 * t + x, 1.0 * t + x, 0.2 * t + x };
        double[] yG = { 1.1 * t + y, 1.2 * t + y, 1.2 * t + y, 1.1 * t + y, 1.0 * t + y, 1.0 * t + y };
        this.segmentos.add(new Segmento(xG, yG));

        setNum(0);
    }

    public void setNum(int numero) {
        if (numero >= 0 && numero <= 9) {
            // desliga tudo
            for (int i = 0; i < 7; i++) {
                segmentos.get(i).switcher(false);
            }

            switch (numero) {
                case 0:
                    // liga todos menos o g
                    for (int i = 0; i < 6; i++) {
                        segmentos.get(i).switcher(true);
                    }
                    break;

                case 1:
                    // liga somente b e c
                    segmentos.get(1).switcher(true);
                    segmentos.get(2).switcher(true);
                    break;

                case 2:
                    // liga todos menos c e f
                    for (int i = 0; i < 7; i++) {
                        if (i != 2 && i != 5) {
                            segmentos.get(i).switcher(true);
                        }
                    }
                    break;

                case 3:
                    // liga todos menos e e f
                    for (int i = 0; i < 7; i++) {
                        if (i != 4 && i != 5) {
                            segmentos.get(i).switcher(true);
                        }
                    }
                    break;

                case 4:
                    // liga todos menos a, d e e
                    for (int i = 0; i < 7; i++) {
                        if (i != 0 && i != 3 && i != 4) {
                            segmentos.get(i).switcher(true);
                        }
                    }
                    break;

                case 5:
                    // liga todos menos b e e
                    for (int i = 0; i < 7; i++) {
                        if (i != 1 && i != 4) {
                            segmentos.get(i).switcher(true);
                        }
                    }
                    break;

                case 6:
                    // liga todos menos b
                    for (int i = 0; i < 7; i++) {
                        if (i != 1) {
                            segmentos.get(i).switcher(true);
                        }
                    }
                    break;

                case 7:
                    // liga apenas a, b e c
                    segmentos.get(0).switcher(true);
                    segmentos.get(1).switcher(true);
                    segmentos.get(2).switcher(true);
                    break;

                case 8:
                    // liga todos
                    for (int i = 0; i < 7; i++) {
                        segmentos.get(i).switcher(true);
                    }
                    break;

                case 9:
                    // liga todos menos e
                    for (int i = 0; i < 7; i++) {
                        if (i != 4) {
                            segmentos.get(i).switcher(true);
                        }
                    }
                    break;

                default:
                    // mostra um E de erro
                    for (int i = 0; i < 7; i++) {
                        if (i != 1 && i != 2) {
                            segmentos.get(i).switcher(true);
                        }
                    }
                    break;
            }
        }
    }

    public void desenhar(Draw desenho, Color cor){
        segmentos.forEach(e -> {
            e.desenhar(desenho, cor);
        });
    }
}
