package engtelecom.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora, int minuto, int segundo) {
        if (!setHora(hora))
            this.hora = 0;
        if (!setMinuto(minuto))
            this.minuto = 0;
        if (!setSegundo(segundo))
            this.segundo = 0;
    }

    public Horario(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Horario(int hora) {
        this(hora, 0, 0);
    }

    public boolean setHora(int hora) {
        if (hora < 0 || hora > 23) {
            return false;
        }

        this.hora = hora;
        return true;
    }

    public boolean setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            return false;
        }

        this.minuto = minuto;
        return true;
    }

    public boolean setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            return false;
        }

        this.segundo = segundo;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    private String converte(int n) {
        return switch (n) {
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "catorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";

            default -> "";
        };
    }

    public String porExtenso() {

        int horaD = (hora / 10) * 10;
        int horaU = hora % 10;
        // int minutoD = (minuto / 10) * 10;
        // int minutoU = minuto % 10;
        // int segundoD = (segundo / 10) * 10;
        // int segundoU = segundo % 10;

        String h = (hora == 1) ? "uma"
                : (hora == 2) ? "duas" : (hora < 20) ? converte(hora) : converte(horaD) + " e " + converte(horaU);

        if (hora < 10) {
            h += " hora";
        } else
            h += " horas";

        if (minuto != 0){
            h += ", ";
        } else {
            h += " e ";
        }

        String m = converterMinSec(" minuto", " minutos", minuto);

        if (segundo != 0){
            m += " e ";
        }

        // if (minuto != 0) {
        // if (segundo == 0) {
        // m += " e ";
        // } else {
        // m += ", ";
        // }
        // if (minuto < 20 && minuto != 1) {
        // m += converte(minuto) + " minutos";
        // } else if (minuto == 1) {
        // m += converte(minutoU) + " minuto";
        // } else {
        // m += converte(minutoD) + " e " + converte(minutoU) + " minutos";
        // }
        // }

        String s = converterMinSec(" segundo", " segundos", segundo);

        return h + m + s;
    }

    private String converterMinSec(String singular, String plural, int n) {

        String s = "";
        int nD = (n / 10) * 10;
        int nU = n % 10;

        if (n < 20 && n != 1) {
            s = converte(n) + plural;
        } else if (n == 1) {
            s = converte(nU) + singular;
        } else {
            s = converte(nD) + " e " + converte(nU) + plural;
        }

        return s;
    }
}
