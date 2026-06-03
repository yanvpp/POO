package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("""
                --------------
                |  RELÓGIOS  |
                --------------

                1. Normal (hora do sistema)
                2. Progressivo
                3. Regressivo
                4. Sair

                """);

        int escolha = Integer.parseInt(IO.readln("Escolha uma opção: "));

        Draw desenho = new Draw();
        ArrayList<Relogio> relogios = new ArrayList<>();

        desenho.setCanvasSize(600, 600);
        desenho.setXscale(0, 600);
        desenho.setYscale(0, 600);

        desenho.enableDoubleBuffering();
        desenho.setDefaultCloseOperation(3);

        relogios.add(new RelogioAnalogico(300, 350));

        relogios.add(new RelogioDisplay(50, 50, 1, Modos.getByOption(escolha), Draw.GREEN));

        relogios.add(new RelogioTexto(400, 500, Modos.getByOption(escolha), 35, Draw.WHITE));

        while (true) {
            desenho.clear(Draw.BLACK);

            for (Relogio relogio : relogios) {
                relogio.atualizarTempo();
                relogio.desenhar(desenho);
            }

            desenho.show();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
