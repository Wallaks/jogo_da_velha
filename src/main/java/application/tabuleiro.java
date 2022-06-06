package application;

public class tabuleiro {

    int x;
    int y;
    int tam = 3;


    public String[][] popula() {
        int tam = 3;
        String matriz[][] = new String[tam][tam];
        //Laço responsável por preencher a matriz com números quaisquer
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                //Gera um numero qualquer para a matriz
                matriz[linha][coluna] = ".";

            }
        }
        return matriz;
    }

    void insere(int x, int y, String matriz[][]) {
        matriz[x][y] = "x";
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
            }
        }
    }

    void formata(String matriz[][]) {
        int count = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            count = count + 1;
            if (count != 0) {
                System.out.print("\n");
                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                    System.out.print(matriz[linha][coluna] + " "); //imprime caracter a caracter
                }
            }
        }
    }
}
