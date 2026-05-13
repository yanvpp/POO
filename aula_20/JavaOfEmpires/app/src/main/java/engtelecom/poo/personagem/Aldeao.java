package engtelecom.poo.personagem;

public class Aldeao extends Personagem {
    
    public Aldeao(String nome, int vida, double ataque, double velocidade) {
        super(nome, vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return "O aldeão " + super.atacar() + " com suas próprias mãos!";
    }

    @Override
    public String mover(int x, int y) {
        return "O aldeão " + super.mover(x, y);
    }
        
}
