package engtelecom.poo.baralhoFrances;

import java.util.Random;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta {

    private String caminho;
    private double x;
    private double y;
    private boolean face;
    private static final int ALTURA = 96;
    private static final int LARGURA = 72;

    public CartaGrafica(Valores valor, Naipes naipe, double x, double y, boolean face) {
        super(valor, naipe);

        this.face = face;
        this.x = x;
        this.y = y;
        this.caminho = "cartas/" + valor.getValor() + naipe.getNaipe() + ".png";
    }

    public void desenhar(Draw draw) {
        if (face) {
            draw.picture(x, y, caminho); // centraliza a imagem baseado na coordenada do clique
        } else {
            Random r = new Random();

            if (r.nextInt(1,3) == 1) {
                draw.picture(x, y, "cartas/fundoa.png");
            } else {
                draw.picture(x, y, "cartas/fundov.png");
            }

        }
        draw.show();
    }

    public void virarCarta(){
        this.face = !face;
    }

    public boolean clicouDentro(double x, double y) {
        if (x > this.x - LARGURA/2 && x < this.x + LARGURA/2){
            if (y > this.y - ALTURA/2 && y < this.y + ALTURA/2){
                return true;
            }
        }

        return false;
    }

}
