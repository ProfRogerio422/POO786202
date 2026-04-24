import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalFunc {

    static Scanner leia = new Scanner(System.in);

    static void main() {

        List<Funcionario> lista = new ArrayList<>();


        System.out.println("Digite quantos funcionários você irá cadastrar: ");
        int numFunc = leia.nextInt();

        for (int i = 0; i < numFunc ; i++) {

            System.out.println("Funcionario #"+(i+1));
            System.out.println("ID: ");
            int id = leia.nextInt();

            // limpar o buffer
            leia.nextLine();

            System.out.println("Nome: ");
            String nome = leia.nextLine();

            System.out.println("Salario: ");
            double salario = leia.nextDouble();

            // Criar o objeto Funcionario
            Funcionario func = new Funcionario(id,nome,salario);

            // Adicionando o funcionario na lista
            lista.add(func);
        }

        System.out.println("Informe o Id do funcionário que terá aumento salaria");
        int idFunc = leia.nextInt();

        Funcionario funcionario = buscarFuncionario(idFunc, lista);

        if (funcionario != null) {
            System.out.println("Digite o valor em % do aumento");
            double porc = leia.nextDouble();
            funcionario.atualizarSalario(porc);
        } else {
            System.out.println("Funcionario não encontrado!!");
        }

        mostrarDados(lista);



    }

    private static void mostrarDados(List<Funcionario> lista) {

        for (Funcionario func : lista) {
            System.out.println(func.getId() + ", " + func.getNome() + " " + func.getSalario());
         }


    }

    private static Funcionario buscarFuncionario(int idFunc, List<Funcionario> lista) {

        for (Funcionario func : lista) {
            if (func.getId() == idFunc ) {
                return func;
            }
        }

        return null;




    }


}
