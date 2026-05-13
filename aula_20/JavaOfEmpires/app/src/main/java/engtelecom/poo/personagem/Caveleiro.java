package engtelecom.poo.personagem;

public class Caveleiro extends Personagem {

    public Caveleiro(String nome, int vida, double ataque, double velocidade) {
        super(nome, vida, ataque, velocidade);
    }
    
    @Override
    public String atacar() {
        return "O cavaleiro " + super.atacar() + " com sua espada!";
    }

    @Override
    public String mover(int x, int y) {
        return "O cavaleiro " + super.mover(x, y);
    }
}
