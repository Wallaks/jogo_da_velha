package application;

import java.util.Scanner;

public class application {

    public static void main(String[] args) throws InterruptedException {

        int tam = 3;
        tabuleiro tab = new tabuleiro();
        String matriz[][] = tab.popula();
        Boolean sair = true;
        do {
            int x = 0;
            int y = 0;
            Scanner ler = new Scanner(System.in);
            System.out.println("informe a linha de 0 a 2: ");
            x = ler.nextInt();

            //(metodo para verificar se a linha e valida)

            System.out.println("informe a coluna de 0  a 2: ");
            y = ler.nextInt();

            //(metodo para verificar se a linha e valida)


            tab.insere(x, y, matriz);
            tab.formata(matriz);
            System.out.print("\n");


        } while (sair);

    }
}

