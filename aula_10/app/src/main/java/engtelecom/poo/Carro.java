package engtelecom.poo;

public class Carro {
    // Atributos
    private String modelo;
    private int velocidadeAtual = 0;
    private int velocidadeMaxima;

    private static final int VELOCIDADE_MAXIMA = 300;
    private static final int VELOCIDADE_MINIMA = 0;

    public Carro(String modelo, int velocidadeMaxima) {
        if(velocidadeMaxima > VELOCIDADE_MAXIMA) this.velocidadeMaxima = VELOCIDADE_MAXIMA;
        
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro(String modelo){
        this.modelo = modelo;
        this.velocidadeMaxima = VELOCIDADE_MAXIMA;
    }

    public void acelerar(int n) {
        if (n < VELOCIDADE_MINIMA) return;

        if ((velocidadeAtual += n) <= velocidadeMaxima) {
            velocidadeAtual += n;
        } else {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    // Métodos
    public void freiar(int n) {
        if (n < VELOCIDADE_MINIMA) return;

        if ((velocidadeAtual -= n) <= VELOCIDADE_MINIMA) {
            velocidadeAtual -= n;
        } else {
            velocidadeAtual = VELOCIDADE_MINIMA;
        }
    }

    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

    // public String getInfo(){
    //     return String.format("O carro %s chega a %s km/h", modelo, velocidadeMaxima);
    // }

    // O mesmo que:
    @Override
    public String toString(){
        return String.format("O carro %s chega a %s km/h", modelo, velocidadeMaxima);
    }

}
