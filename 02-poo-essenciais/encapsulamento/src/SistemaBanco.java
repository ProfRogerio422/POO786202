import java.util.Scanner;

public class SistemaBanco {

    static void main() {


        // Criando o objeto Conta
        Conta conta = new Conta(
                "Rogério",
                "1111",
                "2222",
                "aluno",
                5000);


        System.out.println(conta);

        Scanner leia = new Scanner(System.in);

        System.out.println("Agência: ");
        String agencia = leia.nextLine();

        System.out.println("Número da Conta: ");
        String numConta = leia.nextLine();

        System.out.println("Senha: ");
        String senha = leia.nextLine();

        autenticar(conta, agencia, numConta, senha);





    }

    public static void autenticar(Conta conta,
                           String agencia,
                           String numConta,
                           String senha) {

        if (conta.getAgencia().equals(agencia)
            && conta.getNumConta().equals(numConta)
                && conta.getSenha().equals(senha)) {
            System.out.println("Autenticação realizada com sucesso");
        } else {
            System.out.println("Credenciais inválidas");
        }

    }


}
