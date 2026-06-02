package engtelecom.poo;

import java.util.ArrayDeque;
import java.util.Deque;

import engtelecom.poo.baralhoFrances.Carta;
import engtelecom.poo.baralhoFrances.Naipes;
import engtelecom.poo.baralhoFrances.Valores;
import engtelecom.poo.diasDaSemana.DiasDaSemana;
import engtelecom.poo.diasDaSemana.Disciplina;

public class App {
    public static void main(String[] args) {

        String sigla = IO.readln("Entre com a sigla: ");

        int dia1 = Integer.parseInt(IO.readln("Entre com o 1º dia: "));
        DiasDaSemana d1 = DiasDaSemana.getByCode(dia1);

        int dia2 = Integer.parseInt(IO.readln("Entre com o 2º dia: "));
        DiasDaSemana d2 = DiasDaSemana.getByCode(dia2);

        DiasDaSemana[] dias = {d1, d2};

        Disciplina poo = new Disciplina(sigla, dias);

        System.out.println(poo);



        // exemplo dos planetas
        // int posicao = Integer.parseInt(IO.readln("Entre com a posição do planeta: "));
        
        // Planetas planeta = Planetas.getByPosition(posicao);

        System.out.println(Planetas.getByPosition(Integer.parseInt(IO.readln("Entre com a posição do planeta: "))));
    
    
        // exemplo do baralho

        Deque<Carta> baralho = new ArrayDeque<>();

        for (Naipes n : Naipes.values()) {
            for (Valores v : Valores.values()) {
                Carta carta = new Carta(v, n);

                baralho.add(carta);
            }
        }

        for (Carta c : baralho){
            System.out.println(c);
        }
    }
}
