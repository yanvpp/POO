package engtelecom.poo.dado;

import java.util.Random;

public class Dado {
    private int face;
    protected int[] estatisticas;
    private Random r;

    public Dado(int valor) {
        this.face = 1;
        this.estatisticas = new int[7];
        this.r = new Random();
    }

    public final int lancar() {
        this.face = r.nextInt(1, 7);
        this.estatisticas[this.face]++;
        return this.face;
    }

    public String getEstatisticas() {
        return String.format("""
                ----------------
                | ESTATÍSTICAS |
                ----------------

                1: %d
                2: %d
                3: %d
                4: %d
                5: %d
                6: %d
                
                """, estatisticas[1], estatisticas[2], estatisticas[3], estatisticas[4], estatisticas[5],
                estatisticas[6]);
    }
}
