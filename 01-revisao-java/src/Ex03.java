import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        List<Integer> ids = new ArrayList<>();
        List<String> nomes = new ArrayList<>();
        List<Double> salarios = new ArrayList<>();

        System.out.println("Digite quantos funcionarios voce irá cadastar: ");
        int N = leia.nextInt();

        for (int i = 0 ; i < N ; i++) {
            System.out.println("Funcionário #"+(i+1));
            System.out.println("ID: ");
            int id = leia.nextInt();

            // Limpeza de Buffer
            leia.nextLine();

            System.out.println("Nome: ");
            String nome = leia.nextLine();

            System.out.println("Salario: ");
            double salario = leia.nextDouble();

            // Armazenando infos do funcionario
            ids.add(id);
            nomes.add(nome);
            salarios.add(salario);


        }

        System.out.println("Digite o id do funcionario que você quer dar aumento: ");
        int id = leia.nextInt();        
        // logica de dar aumento
        darAumento(id, salarios, ids, leia);
        
        // Imprimir na tela
        System.out.println("Lista de funcionários: ");
        for (int i = 0; i < N; i++) {
            System.out.println(ids.get(i) + ", "
                    + nomes.get(i) + ", " + salarios.get(i));
        }
        
        leia.close();
        
        


    }

    private static void darAumento(int id,
                                   List<Double> salarios,
                                   List<Integer> ids,
                                   Scanner leia) {

        for (int i = 0 ; i < ids.size(); i++) {
            if (id == ids.get(i)) {
                System.out.println("Digite a porcentagem: ");
                double porcentagem = leia.nextDouble();

                // Dar o aumento
                double salario = salarios.get(i);
                double valor = salario + salario * (porcentagem/100.0);
                salarios.set(i, valor);
            }
        }



    }


}
