package engtelecom.poo;

public class Email {
    private String endereco;
    private String label;

    public Email(String endereco, String label) {
        this.endereco = endereco;
        this.label = label;
    }

    public String getLabel(){
        return label;
    }

    @Override
    public String toString() {
        return String.format("Endereço de email: %s\nRótulo: %s", endereco, label);
    }
}
