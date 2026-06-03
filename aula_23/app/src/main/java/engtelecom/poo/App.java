package engtelecom.poo;

import engtelecom.poo.exemplo.Pessoa;
import engtelecom.poo.exemplo.Caixa;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;

import javax.swing.text.MaskFormatter;

public class App {
    private static final String ArrayList = null;

    // exemplo formatar
    static String formatar(String mask, String valor) throws ParseException {
        
        MaskFormatter maskFormatter = null;

        maskFormatter = new MaskFormatter(mask);
        
        return "";
    }

    public static void main(String[] args) {
        // exemplo em sala - tipos genéricos
        Caixa<String> c = new Caixa<>("Olá, Mundo!");
        Caixa<Pessoa> d = new Caixa<>(new Pessoa("Joao"));

        String s = c.getConteudo();
        // String errado = d.getConteudo(); // gera erro

        // ArrayList<Tipo> lista = new ArrayList<>();

        // exemplo em sala - tratamento de exceções
        // int a, b;

        // try {
        // a = Integer.parseInt(IO.readln("Entre com o número: "));
        // b = Integer.parseInt(IO.readln("Entre com o número: "));

        // int resultado = a / b;

        // System.out.println(a + " dividido por " + b + " = " + resultado);
        // } catch (InputMismatchException e) {
        // System.err.println("Só é permitido números inteiros");
        // } catch (ArithmeticException e) {
        // System.out.println(e.getMessage());
        // System.err.println("Não é permitido dividir por 0");
        // } catch (Exception e) {
        // System.out.println(e.getCause());
        // System.err.println("Como você chegou aqui?");
        // }

        // System.out.println("Fim do programa");
        // }
        
        // exemplo formatar
        try {
            String f = formatar("(##)", "48");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
