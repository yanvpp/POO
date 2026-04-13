package engtelecom.poo;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private ArrayList<Pessoa> autor;
    private ArrayList<Capitulo> livro;

    public Livro(String titulo, Pessoa autor) {
        this.titulo = titulo;
        this.autor = new ArrayList<>();
        this.livro = new ArrayList<>();
    }

    public void adicionaCapitulo(String titulo){
        Capitulo novo = new Capitulo(titulo);
        livro.add(novo);
    }

    
}
