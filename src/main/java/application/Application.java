package application;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        String verificaVencedor = "";
        int tam = 3;
        Tabuleiro tab = new Tabuleiro();
        String matriz[][] = tab.popula();
        Boolean sair = true;
        Boolean verifica = true;
        int jogador = 0;
        do {
            System.out.println("Voce sera o jogador numero 1 ou 2?");
            jogador = ler.nextInt();
            if (jogador > 1) {
                System.out.println(" Insira um numero valido!!! ");
            }
            sair = false;
        } while (sair);
        sair = true;
        System.out.println(" Jogador " + jogador + " comeca o jogo ");
        do {
            int x = 0;
            int y = 0;

            System.out.println("####JOGADOR " + jogador + " #####");
            System.out.println("Informe a linha de 0 a 2: ");
            x = ler.nextInt();
            System.out.println("Informe a coluna de 0  a 2: ");
            y = ler.nextInt();


            do {
                verifica = tab.insere(x, y, matriz, jogador);
                if (verifica) {
                    System.out.println("Posicao valida");

                    tab.formata(matriz);
                    System.out.print("\n");


                    if (jogador == 1) {
                        jogador = 0;
                    } else {
                        jogador = 1;
                    }
                    sair = false;
                } else {
                    System.out.println("Posicao invalida, procure outra!!!");
                    sair = false;
                }
            } while (sair);
            sair = true;
            verificaVencedor = tab.verificaSucess(matriz);
            if(verificaVencedor != null){
                System.out.println(verificaVencedor);
                sair = false;
            }
        } while (sair);

    }
}

