void main(){
    
    // double d = Math.sqrt(4);

    // double a = 6;
    // double b = 4.5;
    // long media = Math.round((a+b)/2);

    // double a = -10;

    // double d = Math.abs(a);

    // String disciplina = "POO";

    // int a = 10;

    // if (a == 10){};

    // if (disciplina.equals("POO")){};

    // String nome = "2";

    // int b = Integer.parseInt(nome);

    // String nome2 = "2.4";

    // double d = Double.parseDouble(nome2);

    // String nome = IO.readln("Entre com o seu nome: ");

    // IO.println("Olá, " + nome + "!");

    // // equivalente:
    // IO.println(String.format("Olá, %s!", nome));

    // // 1. Entrar com nome
    // // 2. Entrar com nome de nascimento:
    // // 3. "Você tem x anos."

    // String nome = IO.readln("Entre com o seu nome: ");
    // // String ano = IO.readln("Entre com o seu ano de nascimento: ");
    // // int idade = 2026 - Integer.parseInt(ano);

    // int idade = 2026 - Integer.parseInt(IO.readln("Entre com o seu ano de nascimento: "));

    // IO.println(nome + ", você tem " + idade + " anos, lide com isso.");

    // Exemplo com for each:

    // Leia 4 notas das avaliações de POO - número real de 0 a 10
    // Calcul e apresente a média - número inteiro de 0 a 10

    double[] notas = new double[4];
    
    for (int i = 0; i < notas.length; i++) {
        notas[i] = Double.parseDouble(IO.readln("Entre com a " + (i+1) + "ª nota: "));
    }
    
    double soma = 0;

    for(double nota : notas){
        soma += nota;
    }

    // for (int i = 0; i < notas.length; i++) {
    //     soma += notas[i];
    // }

    int media = Math.round((float)(soma/notas.length));

    IO.println("Sua média final é: " + media);

}