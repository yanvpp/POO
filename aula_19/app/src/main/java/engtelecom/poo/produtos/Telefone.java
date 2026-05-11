package engtelecom.poo.produtos;

public class Telefone {
    private int codigo;
    private String numSerie;
    protected String modelo;
    private double peso;
    private Dimensao dimensao;

    public Telefone(int c, String n, String m, double peso, Dimensao d) {
        this.codigo = c;
        this.numSerie = n;
        this.modelo = m;
        this.peso = peso;
        this.dimensao = d;
    }

    @Override
    public String toString() {
        return "Telefone [codigo=" + codigo + ", numSerie=" + numSerie + ", modelo=" + modelo + ", peso=" + peso
                + ", dimensao=" + dimensao.toString() + "]";
    }
}
