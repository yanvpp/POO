package engtelecom.poo;

public class Batedeira {
    // Atributos
    private String cor = "branca";
    private int nivel;
    private boolean cheia;
    private boolean ligada;
    private boolean aberta;

    public String getCor(){
        return cor;
    }

    public void ligaDesliga(){
        ligada = !ligada;
    }

    public int getNivel(){
        return nivel;
    }

    public String setNivel(int n){
        if (n < 1 || n > 10) return "Nível não existe, escolhe entre 1 e 10.";

        nivel = n;

        return "";
    }

    public boolean isAberta(){
        return aberta;
    }

    public void abreFecha(){
        aberta = !aberta;
    }

    public String esvaziar(){
        if (!cheia) return "Já está vazia.";

        cheia = false;

        return "Batedeira vazia.";
    }

    public String encher(){
        if (cheia) return "Já está cheia.";
        
        cheia = true;

        return "Batedeira cheia.";
    }

}
