package engtelecom.poo;

public class Livro {
    private final String iSBN;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String iSBN, String titulo, String autor, int anoPublicacao) {
        this.iSBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getISBN(){
        return iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao > 2026) return false;
        this.anoPublicacao = anoPublicacao;
        return true;
    }

    public boolean atualizarLivro(String titulo, String autor, int anoPublicacao){
        if(!setAnoPublicacao(anoPublicacao)) return false;
        setTitulo(titulo);
        setAutor(autor);
        return true;
    }

    @Override
    public String toString() {
        return String.format("""
                ISBN: %s
                Título: %s
                Autor: %s
                Ano de publicação: %d
                """, iSBN, titulo, autor, anoPublicacao);
    }
}
