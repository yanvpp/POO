package engtelecom.poo;

public enum Planetas {
    MERCURIO(1, "Mercúrio"),
    VENUS(2, "Vênus"),
    TERRA(3, "Terra"),
    MARTE(4, "Marte"),
    JUPITER(5, "Júpiter"),
    SATURNO(6, "Saturno"),
    URANO(7, "Urano"),
    NETUNO(8, "Netuno");

    public final int posicao;
    public final String extenso;

    private Planetas(int codigo, String extenso) {
        this.posicao = codigo;
        this.extenso = extenso;
    }

    public static Planetas getByPosition(int posicao) {
        for (Planetas planeta : Planetas.values()){
            if (planeta.posicao == posicao){
                return planeta;
            }
        }

        throw new IllegalArgumentException("posição inválida.");
    }
    
    @Override
    public String toString(){
        return extenso;
    }

}
