package engtelecom.poo.personagem;

public abstract class Personagem {
    protected int vida;
    protected double ataque;
    protected double velocidade;
    protected String nome;

    public Personagem(String nome, int vida, double ataque, double velocidade) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    // não precisa mais, pois está na interface
    // public abstract String atacar();
    // // {
    // //     return String.format("""
    // //             %s atacou e causou %.2f de dano
    // //             """, nome, ataque);
    // // }

    public abstract String mover(int x, int y);
    // {
    //     double distancia = Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));

    //     double tempo = distancia / velocidade;

    //     return String.format("""
    //             %s percorreu %.2f m em %.2f segundos!
    //             """, nome, distancia, tempo);
    // }
}
