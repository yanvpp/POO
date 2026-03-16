package engtelecom.poo;

public class Personagem {
    // Atributos
    private int nivel = 1;
    private int forca = 1;
    private String arma = "Desarmado";
    private int vida = 100;
    private String classe = "Sem classe";

    // Métodos
    public void levelUp(){
        nivel++;
    }

    public int getNivel(){
        return nivel;
    }

    public int getForca(){
        return forca;
    }

    public void setArma(String s){
        arma = s;
    }

    public String getArma(){
        return arma;
    }

    public int getVida(){
        return vida;
    }

    public void setClasse(String s){
        classe = s;
    }

    public String getClasse(){
        return classe;
    }
}
