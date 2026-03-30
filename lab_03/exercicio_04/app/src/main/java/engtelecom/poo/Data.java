package engtelecom.poo;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        int maxDias = maxDias(mes, ano);

        if (!setDia(dia, maxDias) || !setMes(mes) || !setAno(ano)) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1970;
            return;
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int dia, int mes) {
        this(dia, mes, 1970);
    }

    public Data(int dia) {
        this(dia, 1, 1970);
    }

    private int maxDias(int mes, int ano) {
        int diasFevereiro;

        if (isBissexto(ano)) {
            diasFevereiro = 29;
        } else
            diasFevereiro = 28;

        return switch (mes) {
            case 2 -> diasFevereiro;

            case 1, 3, 5, 7, 8, 10, 12 -> 31;

            default -> 30;
        };
    }

    public int getDia() {
        return dia;
    }

    private boolean isBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

    public boolean setDia(int dia, int maxDias) {
        if (dia < 1 || dia > maxDias) {
            return false;
        }

        this.dia = dia;
        return true;
    }

    public int getMes() {
        return mes;
    }

    public boolean setMes(int mes) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        this.mes = mes;
        return true;
    }

    public int getAno() {
        return ano;
    }

    public boolean setAno(int ano) {
        if (ano < 0) {
            return false;
        }
        this.ano = ano;
        return true;
    }

    // private String diaExtenso(int n){
    // return switch (n) {
    // case 1 -> "primeiro";
    // case 2 -> "dois";
    // case 3 -> "três";
    // case 4 -> "quatro";
    // case 5 -> "cinco";
    // case 6 -> "seis";
    // case 7 -> "sete";
    // case 8 -> "oito";
    // case 9 -> "nove";
    // case 10 -> "dez";
    // case 11 -> "onze";
    // case 12 -> "doze";
    // case 13 -> "treze";
    // case 14 -> "quatorze";
    // case 15 -> "quinze";
    // case 16 -> "dezesseis";
    // case 17 -> "dezessete";
    // case 18 -> "dezoito";
    // case 19 -> "dezenove";
    // case 20 -> "vinte";
    // default -> "trinta";
    // };
    // }

    private String mesExtenso() {
        return switch (this.mes) {
            case 1 -> "janeiro";
            case 2 -> "fevereiro";
            case 3 -> "março";
            case 4 -> "abril";
            case 5 -> "maio";
            case 6 -> "junho";
            case 7 -> "julho";
            case 8 -> "agosto";
            case 9 -> "setembro";
            case 10 -> "outubro";
            case 11 -> "novembro";
            default -> "dezembro";
        };
    }

    @Override
    public String toString() {
        // int diaU = this.dia % 10;
        // int diaD = (this.dia / 10 )* 10;

        // String dia = (this.dia < 19 && this.dia != 10) ? diaExtenso(this.dia) :
        // diaExtenso(diaD) + " e " + diaExtenso(diaU);
        String mes = mesExtenso();

        return dia + " de " + mes + " de " + ano;
    }

    private int totalDias(int d, int m, int a) {
        int total = 0;

        for (int i = 1; i < a; i++) {
            total += isBissexto(i) ? 366 : 365;
        }

        for (int i = 1; i < m; i++) {
            total += maxDias(i, a);
        }

        return total + d;
    }

    public int diferenca(Data data) {
        // Data maior = new Data(1);
        // Data menor = new Data(1);

        // if (data.ano > ano) {
        // maior.ano = data.ano;
        // menor.ano = ano;
        // } else {
        // maior.ano = ano;
        // menor.ano = data.ano;
        // }

        // if (data.mes > mes) {
        // maior.mes = data.mes;
        // menor.mes = mes;
        // } else {
        // maior.mes = mes;
        // menor.mes = data.mes;
        // }

        // if (data.dia > dia) {
        // maior.dia = data.dia;
        // menor.dia = dia;
        // } else {
        // maior.dia = dia;
        // menor.dia = data.dia;
        // }

        // return (maior.dia - menor.dia) + (maior.mes - menor.mes) * 30 + (maior.ano -
        // menor.ano) * 365;
        // }

        int diasData1 = totalDias(dia, mes, ano);
        int diasData2 = totalDias(data.dia, data.mes, data.ano);

        return Math.abs(diasData1 - diasData2);
    }
}
