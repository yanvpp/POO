package engtelecom.poo.diasDaSemana;

import java.util.Arrays;

public class Disciplina {
    private String sigla;
    private DiasDaSemana[] dias;

    public Disciplina(String sigla, DiasDaSemana[] dias){
        this.sigla = sigla;
        this.dias = dias;
    }

    @Override
    public String toString(){
        return "Sigla: " + sigla + "\nAulas: " + Arrays.toString(dias);
    }
}
