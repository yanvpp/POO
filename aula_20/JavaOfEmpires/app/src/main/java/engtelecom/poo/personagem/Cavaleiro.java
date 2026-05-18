package engtelecom.poo.personagem;

public class Cavaleiro extends Personagem implements Guerreiro {

    public Cavaleiro(String nome, int vida, double ataque, double velocidade) {
        super(nome, vida, ataque, velocidade);
    }
    
    @Override
    public String atacar() {
        return String.format("""
                O cavaleiro %s atacou e causou %.2f de dano com suas próprias mãos!
                """, nome, ataque);
    }

    @Override
    public String mover(int x, int y) {
        double distancia = Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));

        double tempo = distancia / velocidade;

        return String.format("""
                O cavaleiro %s percorreu %.2f m em %.2f segundos!
                """, nome, distancia, tempo);
    }

}
