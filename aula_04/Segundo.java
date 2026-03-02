void main(){
    IO.println("Olá, Mundo!");

    // int i = 10;
    // String resultado = switch (i){
    //     case 1 -> "um";
    //     case 2 -> "dois";
    //     case 3 -> "três";
    //     case 4 -> "quatro";
    //     default -> "outro valor";
    // };

    // IO.println(resultado);

    // o mesmo pode ser escrito com mais linhas, como em C:

    // switch (i) {
    //     case 1:
    //         resultado = "um";
    //         break;
    
    //     case 2:
    //         resultado = "dois";
    //         break;

    //     case 3:
    //         resultado = "três";
    //         break;

    //     case 4:
    //         resultado = "quatro";
    //         break;

    //     default:
    //         resultado = "outro valor";
    // }

    // IO.println(resultado);

    // int[] vector = new int[3];

    // vector[0] = 10;
    // vector[1] = 2;
    // vector[2] = 5;

    // int[][] matriz = new int[2][3];

    // matriz[1][2] = 10;
    
    int[][] matriz = new int[3][3];

    matriz[0][0] = 1;
    matriz[1][1] = 1;
    matriz[2][2] = 1;

    for(int i = 0; i < 3; i++){
        for (int j = 0; j == i; j++){
            IO.println(matriz[i][j]);
        }
    }
}