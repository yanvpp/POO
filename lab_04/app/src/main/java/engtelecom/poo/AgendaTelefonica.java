package engtelecom.poo;

import java.util.ArrayList;

public class AgendaTelefonica {
    private ArrayList<Contato> contatos;

    public AgendaTelefonica() {

    }

    public boolean addContato(String nome, String sobrenome, String birthDate) {
        Contato contato = new Contato(nome, sobrenome, birthDate);

        return contatos.add(contato);
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome) {
        return contatos;
    }

    public boolean removeContato(String nome) {
        return false;
    }

    public boolean addTelefone(int numero, String label) {
        return false;
    }

    public boolean removeTelefone(int numero) {
        return false;
    }

    public boolean updateTelefone(int numero, String label) {
        return false;
    }

    public boolean addEmail(String endereco, String label) {
        return false;
    }

    public boolean removeEmail(String endereco) {
        return false;
    }

    public boolean updateEmail(String endereco, String label) {
        return false;
    }

    @Override
    public String toString() {
        String contacts = "";

        for (Contato e : contatos) {
            contacts += e.toString() + "\n";
        }

        return String.format("""
                ------------
                | CONTATOS |
                ------------

                %s
                """, contacts);
    }
}
