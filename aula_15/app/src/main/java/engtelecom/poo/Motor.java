package engtelecom.poo;

public class Motor {
    private int horsepower;
    private int giroAtual;
    private int cilindros;

    public Motor(int hp, int cilindros){
        this.horsepower = hp;
        this.giroAtual = 0;
        this.cilindros = cilindros;
    }

    public void acelerar(int valor){
        giroAtual = valor;
    }

    // public int getVelocidade(){
    //     return giroAtual;
    // }

    // public int getHorsePower(){
    //     return horsepower;
    // }

    // public int getCilindros(){
    //     return cilindros;
    // }
}
