package engtelecom.poo;

public class Carro {
    private String marca;
    private Motor propulsor;

    public Carro(String marca, Motor motor){
        this.marca = marca;
        this.propulsor = motor;
    }

    public void acelerar(int valor){
        this.propulsor.acelerar(valor);
    }

    public void trocarMotor(Motor motor){
        this.propulsor = motor;
    }

    // public int getVelocidade(){
    //     return propulsor.getVelocidade();
    // }

    // public String getMarca(){
    //     return marca;
    // }

}
