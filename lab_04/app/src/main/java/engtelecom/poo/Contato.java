package engtelecom.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate birthDate;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome, String sobrenome, String birthDate) {
        this.nome = nome;
        this.sobrenome = sobrenome;

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        this.birthDate = LocalDate.parse(birthDate, formatoData);
    }

    public boolean addTelefone(int numero, String label) {
        // verifica se o número é válido
        String eR = "^[0-9]+$";
        String numeroS = String.valueOf(numero);
        if (numeroS.matches(eR)) {
            return false;
        }

        Telefone telefone = new Telefone(numero, label);

        return telefones.add(telefone);
    }

    public boolean removeTelefone(int numero) {
        return false;
    }

    public boolean updateTelefone(int numero, String label) {
        return false;
    }

    public boolean addEmail(String endereco, String label) {
        // verifica se o email é válido
        String eR = "^[a-zA-Z0-9]+$";
        if (endereco.matches(eR)) {
            return false;
        }

        Email email = new Email(endereco, label);

        return (emails.add(email));
    }

    public boolean removeEmail(String endereco) {
        return false;
    }

    public boolean updateEmail(String endereco, String label) {
        return false;
    }

    @Override
    public String toString(){
        String numeros = "";

        for(Telefone e : telefones){
            numeros += e.toString() + "\n";
        }

        String enderecos = "";

        for(Email e : emails){
            enderecos += e.toString() + "\n"; 
        }
        
        return String.format("""
                Nome: %s %s
                Data de nascimento: %s
                Números:
                %s
                Endereços de email:
                %s
                """, nome, sobrenome, numeros, enderecos, birthDate);
    }
}
