package engtelecom.poo;

public class Endereco {
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;

    public Endereco(String cep, String logadouro, int numero, String complemento){
        this.cep = cep;
        this.logradouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String toString(){
        return String.format("""
                    CEP: %s
                    Logradouro: %s
                    Número: %d
                    Complemento: %s
                    """, cep, logradouro, numero, complemento);
    }
}
