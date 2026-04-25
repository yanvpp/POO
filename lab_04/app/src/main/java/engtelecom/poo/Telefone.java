package engtelecom.poo;

public class Telefone {
    private int numero;
    private String label;

    public Telefone(int numero, String label){
        this.numero = numero;
        this.label = label;
    }

    @Override
    public String toString(){
        return String.format("Número: %s\nRótulo: %s", numero, label);
    }
}
