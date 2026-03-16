package engtelecom.poo;

public class Disciplina {
    // Atributos
    private int alunosMatriculados = 0;
    private String[] dataProvas = new String[4];
    private String professor = "Emerson Mello";

    // Métodos
    public String getProfessor(){
        return professor;
    }

    public int getAlunos(){
        return alunosMatriculados;
    }

    public String setAlunos(int n){
        if (n < 0) return "O número de alunos deve ser positivo.";
        
        alunosMatriculados = n;

        return "";
    }

    public void setProva(int p, String data){
        dataProvas[p] = data;
    }

    public String getProva(int p){
        return String.format("A p%d está marcada para o dia %s.", p, dataProvas[p]);
    }
}
