package engtelecom.poo.personagem;

public class Aldeao extends Personagem implements Coletador, Guerreiro {

    public Aldeao(String nome, int vida, double ataque, double velocidade) {
        super(nome, vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return String.format("""
                O aldeão %s atacou e causou %.2f de dano com suas próprias mãos!
                """, nome, ataque);
    }

    @Override
    public String mover(int x, int y) {
        double distancia = Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));

        double tempo = distancia / velocidade;

        return String.format("""
                O aldeão %s percorreu %.2f m em %.2f segundos!
                """, nome, distancia, tempo);
    }

    @Override
    public String coletarMadeira() {
        return String.format("""
                O aldeão %s coletou madeira!
                """, nome);
    }

    @Override
    public String coletarOuro() {
        return String.format("""
                O aldeão %s coletou ouro!
                """, nome);
    }
}
