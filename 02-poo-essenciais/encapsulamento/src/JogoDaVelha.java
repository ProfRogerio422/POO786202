import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Nome do jogador 1 (X):  ");
        Jogador j1 = new
                Jogador(leia.nextLine(), 'X');

        System.out.println("Nome do jogador 2 (O):  ");
        Jogador j2 = new
                Jogador(leia.nextLine(), 'O');

        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador atual = j1;

        while(true) {

            tabuleiro.mostrar();
            System.out.println(atual.nome + " ("
            + atual.simbolo + ") escolha linha e coluna (0-2)"
            );
            int linha = leia.nextInt();
            int coluna = leia.nextInt();

            if (tabuleiro.jogar(linha,coluna,atual.simbolo) == false) {
                System.out.println("Posição inválida, tente novamente");
                continue;
            }

            if (tabuleiro.verificarVitoria(atual.simbolo)) {
                tabuleiro.mostrar();
                System.out.println("Parabéns " + atual.nome + " voce ganhou!");
                break;
            }

            if (tabuleiro.cheio()) {
                tabuleiro.mostrar();
                System.out.println("Deu velha!");
                break;
            }

            // Trocando de jogador
            if (atual == j1) {
                atual = j2;
            } else {
                atual = j1;
            }



        }







    }

}
