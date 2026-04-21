import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();
        int menu = 0;

        while(menu != 5) {
            System.out.println("Digite 1 para cadastrar uma pessoa");
            System.out.println("Digite 5 para sair ");
            menu = leia.nextInt();

            leia.nextLine();

            if (menu == 1) {

                System.out.println("Nome: ");
                String nome = leia.nextLine();

                System.out.println("Altura: ");
                double altura = leia.nextDouble();

                System.out.println("Idade: ");
                int idade = leia.nextInt();

                System.out.println("Peso: ");
                double peso = leia.nextDouble();

                // Criando o objeto
                Pessoa pessoa = new Pessoa(nome,idade,altura,peso);
                lista.add(pessoa);

                System.out.println("Pessoa cadastrada com sucesso");
            }
        }
        for (Pessoa p : lista) {
            if (p.idade >= 18) {
                System.out.println("Nome: " + p.nome
                        + " com IMC de " + p.calcularIMC());
            }
        }
        leia.close();
    }
}
