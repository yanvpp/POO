package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public boolean addContato(String nome, String sobrenome, LocalDate birthDate) {
        Contato contato = new Contato(nome, sobrenome, birthDate);

        return contatos.add(contato);
    }

    private Contato filtro(String nome, String sobrenome) {
        for (Contato e : contatos) {
            if (e.getNome().equals(nome) && e.getSobrenome().equals(sobrenome)) {
                return e;
            }
        }

        return null;
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome) {
        List<Contato> filtro = contatos.stream()
                .filter(contato -> contato.getNome().equals(nome))
                .filter(contato -> contato.getSobrenome().equals(sobrenome))
                .toList();

        return new ArrayList<>(filtro);
    }

    public boolean removeContato(String nome, String sobrenome) {
        return contatos.removeIf(contato -> contato.getNome().equals(nome) && contato.getSobrenome().equals(sobrenome));
    }

    public boolean updateContato(String nome, String sobrenome, LocalDate birthDate){
        Contato contato = filtro(nome, sobrenome);

        if(contato != null){
            return contato.updateDadosContato(nome, sobrenome, birthDate);
        }

        return false;
    }

    public boolean addTelefone(String nome, String sobrenome, String numero, String label) {
        String eR = "^[0-9]+$";
        if (!numero.matches(eR)) {
            return false;
        }

        Contato contato = filtro(nome, sobrenome);

        if (contato != null) {
            return contato.addTelefoneNoContato(numero, label);
        }

        return false;
    }

    public boolean removeTelefone(String nome, String sobrenome, String label) {
        for (Contato e : contatos) {
            if (e.getNome().equals(nome) && e.getSobrenome().equals(sobrenome)) {
                return e.removeTelefoneDoContato(label);
            }
        }

        return false;
    }

    public boolean updateTelefone(String nome, String sobrenome, String numero, String label) {
        for (Contato e : contatos) {
            if (e.getNome().equals(nome) && e.getSobrenome().equals(sobrenome)) {
                return e.updateTelefoneNoContato(numero, label);
            }
        }
        
        return false;
    }

    public boolean addEmail(String nome, String sobrenome, String endereco, String label) {
        // verifica se o email é válido
        String eR =  "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (!endereco.matches(eR)) {
            return false;
        }
        
        Contato contato = filtro(nome, sobrenome);

        if (contato != null) {
            return contato.addEmailNoContato(endereco, label);
        }

        return false;
    }

    public boolean removeEmail(String nome, String sobrenome, String label) {
        for (Contato e : contatos) {
            if (e.getNome().equals(nome) && e.getSobrenome().equals(sobrenome)) {
                return e.removeEmailDoContato(label);
            }
        }

        return false;
    }

    public boolean updateEmail(String nome, String sobrenome, String endereco, String label) {
        for (Contato e : contatos) {
            if (e.getNome().equals(nome) && e.getSobrenome().equals(sobrenome)) {
                return e.updateEmailNoContato(endereco, label);
            }
        }
        
        return false;
    }

    @Override
    public String toString() {
        StringBuilder contacts = new StringBuilder();

        for (Contato e : contatos) {
            contacts.append(e.toString()).append("\n");
        }

        return String.format("""
                ------------
                | CONTATOS |
                ------------

                %s
                """, contacts);
    }
}
