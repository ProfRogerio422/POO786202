import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class JogoDaForca {
    static void main() {

        Scanner leia = new Scanner(System.in);
        int numTentativas = 6;
        int tentativas = 0;
        StringBuilder palavraAdvinha = new StringBuilder();
        String palavra = sortiarPalavra();


        int tamanho = palavra.length();
        for (int i = 0; i < tamanho; i++) {
            palavraAdvinha.append("_");
        }



        while (true) {

            System.out.println("Palavra "
                    + palavraAdvinha);

            System.out.println("Digite uma letra: ");
            char letra =
                    leia.next().toUpperCase().charAt(0);
            boolean acertou = false;

            for (int i = 0; i < palavra.length(); i++) {
                if (letra == palavra.charAt(i)) {
                    palavraAdvinha.setCharAt(i, letra);
                    acertou = true;
                }
            }
            if (!acertou) {
                tentativas++;
                System.out.println("Letra incorreta");
                System.out.println("Tentativas restantes " +
                        (numTentativas- tentativas));
            }

            if (tentativas == numTentativas) {
                System.out.println("Que pena você perdeu");
                System.out.println("A palavra é " + palavra);
                break;
            }

            if (palavra.equals(palavraAdvinha.toString())) {
                System.out.println("Parabéns você acertou");
                System.out.println("A palavra é " + palavra);
                break;
            }













        }



    }


    public static String sortiarPalavra() {

        List<String> lista = new ArrayList<>();
        lista.add("COMPUTADOR");
        lista.add("MONITOR");
        lista.add("JAVA");
        lista.add("MUNDO");

        Random aleatorio = new Random();
        int indice =
                aleatorio.nextInt(0,lista.size()-1);

        return lista.get(indice);


    }



}
