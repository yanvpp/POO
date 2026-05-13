package engtelecom.poo.personagem;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome, int vida, double ataque, double velocidade) {
        super(nome, vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return "O arqueiro " + super.atacar() + " com suas flechas!";
    }

    @Override
    public String mover(int x, int y) {
        return "O arqueiro " + super.mover(x, y);
    }
    
}
