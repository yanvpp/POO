package engtelecom.poo;

public class Motor {
    private String tipo;
    private boolean ligado;
    private double consumoPorHora;

    public Motor(String tipo, double consumoPorHora) {
        this.tipo = tipo;
        this.consumoPorHora = consumoPorHora;
    }

    public void ligaDesliga() {
        ligado = !ligado;
    }

    @Override
    public String toString(){
        return String.format("""
                    Tipo do motor: %s
                    Consumo/h por motor: %.2f L/h
                    """, tipo, consumoPorHora);
    }
}
