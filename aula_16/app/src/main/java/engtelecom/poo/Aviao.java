package engtelecom.poo;

import java.util.ArrayList;

public class Aviao {
    private int maxTripulantes;
    private long maxPassageiros;
    private double maxPeso;
    private double maxCombustivel;
    private int maxMotores;
    private ArrayList<Motor> motores;

    public Aviao(int maxTripulantes, long maxPassageiros,
            double maxPeso, double maxCombustivel, int maxMotores,
            String tipoMotor, double consumoMotor) {

        if (!tipoMotor.equalsIgnoreCase("helice") &&
                !tipoMotor.equalsIgnoreCase("turbina")) {

            tipoMotor = "helice";
        }

        if (maxMotores > 8) {
            maxMotores = 8;
        } else if (maxMotores <= 0) {
            maxMotores = 1;
        }

        this.motores = new ArrayList<>();

        for (int i = 0; i < maxMotores; i++) {
            motores.add(new Motor(tipoMotor, consumoMotor));
        }

        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.maxPeso = maxPeso;
        this.maxCombustivel = maxCombustivel;
        this.maxMotores = maxMotores;

    }

    public void ligaDesligaTodosMotores() {
        for (Motor motor : motores) {
            motor.ligaDesliga();
        }
    }

    public void ligaDesligaMotor(int motor) {
        motores.get(motor).ligaDesliga();
    }

    @Override
    public String toString() {
        return String.format("""
                ---------------
                |    AVIÃO    |
                ---------------
                Capacidade máxima: %d
                Peso máximo: %.2f kg
                Quantidade de motores: %d
                """, maxTripulantes + maxPassageiros, maxPeso, maxMotores) + motores.get(0);
    }
}