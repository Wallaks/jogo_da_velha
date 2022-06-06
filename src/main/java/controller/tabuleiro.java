package controller;

public class tabuleiro {

    public static void popula() {
        int tam = 3;
        String matriz[][] = new String[tam][tam];
        //Laço responsável por preencher a matriz com números quaisquer
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                //Gera um numero qualquer para a matriz
                matriz[linha][coluna] = ".";
                System.out.print(matriz[linha][coluna] + " "); //imprime caracter a caracter
            }
        }

        System.out.print("\n" + "Situacao atual do tabuleiro" + "\n");
    }

    public static void insere(int x, int y) {
        int tam = 3;
        String matriz[][] = new String[tam][tam];
        matriz[x][y] = "x";
        System.out.print("\n" + "Situacao atual do tabuleiro" + "\n");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " "); //imprime caracter a caracter
            }
        }
    }
}
