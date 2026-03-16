package engtelecom.poo;

public class Caneta {
    private double carga = 100;
    private String cor;
    private boolean aberta;

    // acessores (get) e modificadores (get)

    public void setCor(String c) {
        cor = c;
    }

    public String getCor() {
        return cor;
    }

    public double getCarga() {
        return carga;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrirFechar() {
        aberta = !aberta;
    }

    public void refill() {
        carga = 100;
    }

    public String draw(double x1, double x2, double y1, double y2) {
        if (!isAberta()) return "Caneta fechada, precisa remover a tampa antes de usar.";

        double tamanho = Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        double tintaGasta = tamanho * 0.01;

        if (carga < tintaGasta) return "Não tem tinta suficiente, precisa recarregar antes de usar.";

        carga -= tintaGasta;

        return String.format("Desenhei %.2f cm e consumi %.2f ml de tinta", tamanho, tintaGasta);
    }
}
