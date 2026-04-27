package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate birthDate;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome, String sobrenome, LocalDate birthDate) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.birthDate = birthDate;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public boolean addTelefoneNoContato(String numero, String label) {
        Telefone telefone = new Telefone(numero, label);

        return telefones.add(telefone);
    }

    public boolean removeTelefoneDoContato(String label) {
        return telefones.removeIf(telefone -> telefone.getLabel().equals(label));
    }

    public boolean updateTelefoneNoContato(String numero, String label) {
        // remove o antigo
        telefones.removeIf(telefone -> telefone.getLabel().equals(label));

        // cria um novo com as novas informações
        return addTelefoneNoContato(numero, label);
    }

    public boolean addEmailNoContato(String endereco, String label) {
        Email email = new Email(endereco, label);

        return (emails.add(email));
    }

    public boolean removeEmailDoContato(String label) {
        return emails.removeIf(email -> email.getLabel().equals(label));
    }

    public boolean updateEmailNoContato(String endereco, String label) {
        emails.removeIf(email -> email.getLabel().equals(label));

        return addEmailNoContato(endereco, label);
    }

    @Override
    public String toString() {

        // substituir por StringBuilder

        StringBuilder numeros = new StringBuilder();

        for (Telefone e : telefones) {
            numeros.append(e.toString()).append("\n");
        }

        StringBuilder enderecos = new StringBuilder();

        for (Email e : emails) {
            enderecos.append(e.toString()).append("\n");
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
