package engtelecom.poo;

public class Robo {
    private String nome;
    private long numSerie;
    private static long totalRobos = 0;
    private double x;
    private double y;

    public Robo(String nome) {
        this.nome = nome;
        this.numSerie = totalRobos + 1;
    }

    public long getNumSerie() {
        return numSerie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return String.format("X: %.2f\tY: %.2f", x, y);
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nSerial number: %d\nCoordinates: ", nome, numSerie) + toString();
    }
}
