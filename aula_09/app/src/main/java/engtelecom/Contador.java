package engtelecom;

public class Contador {
    // atributos
    private int valorAtual = 0;

    public String setValor(int valor){
        if (valor < 0) return ("Valor inválido. Insira um valor entre 0 e 9999.");

        valorAtual = valor;

        return String.format("Valor atual: ", valorAtual);
    }

    public void incrementarValor(){
        valorAtual++; 
    }

    public int getValor(){
        return valorAtual;
    }
}
