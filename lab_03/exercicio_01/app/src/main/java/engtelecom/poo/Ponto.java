package engtelecom.poo;

public class Ponto {
    // Atributos
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Ponto b){
        return Math.sqrt((Math.pow((this.x - b.x), 2) + Math.pow((this.y - b.y), 2)));
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    @Override
    public String toString() {
        return String.format("X: %.2f\tY: %.2f", x ,y);
    }
}
