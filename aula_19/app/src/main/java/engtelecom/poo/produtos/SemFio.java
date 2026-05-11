package engtelecom.poo.produtos;

public class SemFio extends Telefone {

    private double frequencia, distanciaOperacao;
    private int canais;

    public SemFio(int c, String n, String m, double peso, Dimensao d, double frequencia, double distanciaOperacao,
            int canais) {
        super(c, n, m, peso, d);
        this.frequencia = frequencia;
        this.distanciaOperacao = distanciaOperacao;
        this.canais = canais;
        this.modelo = m;
    }

    @Override
    public String toString() {
        return super.toString() + "[frequencia=" + frequencia + ", distanciaOperacao=" + distanciaOperacao + ", canais="
                + canais
                + "]";
    }
}
