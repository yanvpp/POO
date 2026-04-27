package engtelecom.poo;

public class Telefone {
    private String numero;
    private String label;

    public Telefone(String numero, String label){
        this.numero = numero;
        this.label = label;
    }

    public String getLabel(){
        return label;
    }

    @Override
    public String toString(){
        return String.format("Número: %s\nRótulo: %s", numero, label);
    }
}
