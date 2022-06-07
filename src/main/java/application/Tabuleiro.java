package application;

public class Tabuleiro {


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

    boolean insere(int x, int y, String[][] matriz, int jogador) {
        if (matriz[x][y] == ".") {
            if (jogador == 1) {
                matriz[x][y] = "x";
                return true;
            } else {
                matriz[x][y] = "o";
                return true;
            }
        }
        return false;
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

    String verificaSucess(String[][] matriz) {
        String[][] matrizVerifica = matriz;
        if (matrizVerifica[0][0] == "x" && matrizVerifica[0][1] == "x" && matrizVerifica[0][2] == "x") {
            System.out.println("Jogador 1 venceu");
        } else {
            if (matrizVerifica[1][0] == "x" && matrizVerifica[1][1] == "x" && matrizVerifica[1][2] == "x") {
                System.out.println("Jogador 1 venceu");
            } else {
                if (matrizVerifica[2][0] == "x" && matrizVerifica[2][1] == "x" && matrizVerifica[2][2] == "x") {
                    System.out.println("Jogador 1 venceu");
                } else {
                    if (matrizVerifica[0][0] == "o" && matrizVerifica[0][1] == "o" && matrizVerifica[0][2] == "o") {
                        System.out.println("Jogador 2 venceu");
                    } else {
                        if (matrizVerifica[1][0] == "o" && matrizVerifica[1][1] == "o" && matrizVerifica[1][2] == "o") {
                            System.out.println("Jogador 2 venceu");
                        } else {
                            if (matrizVerifica[2][0] == "o" && matrizVerifica[2][1] == "o" && matrizVerifica[2][2] == "o") {
                                System.out.println("Jogador 2 venceu");
                            } else {
                                if (matrizVerifica[0][0] == "x" && matrizVerifica[1][0] == "x" && matrizVerifica[2][0] == "x") {
                                    System.out.println("Jogador 1 venceu");
                                } else {
                                    if (matrizVerifica[0][1] == "x" && matrizVerifica[1][1] == "x" && matrizVerifica[2][1] == "x") {
                                        System.out.println("Jogador 1 venceu");
                                    } else {
                                        if ((matrizVerifica[0][0]) == "x" && (matrizVerifica[1][1]) == "x" && (matrizVerifica[2][2]) == "x") {
                                            System.out.println("Jogador 1 venceu");
                                        } else {
                                            if (matrizVerifica[0][0] == "o" && matrizVerifica[1][0] == "o" && matrizVerifica[2][0] == "o") {
                                                System.out.println("Jogador 2 venceu");
                                            } else {
                                                if (matrizVerifica[0][1] == "o" && matrizVerifica[1][1] == "o" && matrizVerifica[2][1] == "o") {
                                                    System.out.println("Jogador 2 venceu");
                                                } else {
                                                    if ((matrizVerifica[0][0]) == "o" && (matrizVerifica[1][1]) == "o" && (matrizVerifica[2][2]) == "o") {
                                                        System.out.println("Jogador 2 venceu");
                                                    } else {
                                                        if (matrizVerifica[0][0] == "x" && matrizVerifica[1][1] == "x" && matrizVerifica[2][2] == "x") {
                                                            System.out.println("Jogador 1 venceu");
                                                        } else {
                                                            if (matrizVerifica[0][0] == "o" && matrizVerifica[1][1] == "o" && matrizVerifica[2][2] == "o") {
                                                                System.out.println("Jogador 2 venceu");
                                                            } else {
                                                                if (matrizVerifica[0][2] == "x" && matrizVerifica[1][1] == "x" && matrizVerifica[2][0] == "x") {

                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
