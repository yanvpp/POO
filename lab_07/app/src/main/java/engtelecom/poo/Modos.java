package engtelecom.poo;

public enum Modos {
    RELOGIO(1),
    CRONO_PROG(2),
    CRONO_REG(3);

    public final int opcao;

    private Modos(int opcao){
        this.opcao = opcao;
    }

    public static Modos getByOption(int opcao){
        for (Modos modo : Modos.values()){
            if (modo.opcao == opcao){
                return modo;
            }
        }

        throw new IllegalArgumentException("opção inválida.");
    }
}
