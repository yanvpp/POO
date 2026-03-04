public class Argumentos {

    public static void main(String[] args) {

        // String nome = IO.readln("Entre com o seu nome: ");

        if(args.length == 2){
        System.out.println("Bom dia, " + args[0] + "!" + " Teremos aula de " + args[1] + ".");
    } else {
        System.out.println("Quantidade incorreta de argumentos. Argumentos esperados: 2. Programa encerrado");
    }

    }

}