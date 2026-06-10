package engtelecom.poo;

import engtelecom.poo.baralhoFrances.*;

import java.util.ArrayList;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

public class App implements DrawListener {

    private Draw draw;
    private ArrayList<CartaGrafica> baralho = new ArrayList<>();

    public App() {
        this.draw = new Draw();
        this.draw.setCanvasSize(1200, 600);
        this.draw.setXscale(0, 1200);
        this.draw.setYscale(0, 600);
        this.draw.enableDoubleBuffering();
        this.draw.setDefaultCloseOperation(3); // 3 == JFrame.EXIT_ON_CLOSE
        this.draw.setTitle("Jogo de cartas");

        this.draw.addListener(this);

        this.draw.clear(Draw.GREEN);
        this.draw.show();

        double x = 60;

        for (Naipes n : Naipes.values()) {
            for (Valores v : Valores.values()) {
                CartaGrafica cg = new CartaGrafica(v, n, x, 300, false);

                x += 21;

                baralho.add(cg);
            }
        }
    }

    @Override
    public void mouseClicked(double x, double y) {
        for (CartaGrafica c : baralho) {
            if (c.clicouDentro(x, y)){
                c.virarCarta();
                c.desenhar(draw);
            }
        }
        draw.show();
    }

    public static void main(String[] args) {
        App app = new App();

        for (CartaGrafica c : app.baralho) {
            c.desenhar(app.draw);
        }

        app.draw.show();

    }
}
