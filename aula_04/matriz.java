void main() {
    int[][] matriz = new int[3][3];

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i == j) {
                matriz[i][j] = 1;
            } else {
                matriz[i][j] = 0;
            }
        }
    }
    for (int k = 0; k < 3; k++) {
        for (int j = 0; j < 3; j++) {
            IO.print(matriz[k][j]);
        }
        IO.print("\n");
    }
}