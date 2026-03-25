package engtelecom.poo;

public class Robo {
    private String nome;
    private long numSerie;
    private static long totalRobos = 0;

    public Robo(String nome) {
        this.nome = nome;
        this.numSerie = totalRobos + 1;
    }

    public long getNumSerie(){
        return numSerie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
