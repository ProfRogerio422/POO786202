public class Metodos {

    public static void main(String[] args) {
        saudacao("Rogério");
        saudacao();
        saudacao("Rogério", "30");
    }

    public static void saudacao() {
        System.out.println("Bem vindo");
    }

    public static void saudacao(String nome) {
        System.out.println("Bem vindo " + nome);
    }

    public static void saudacao(String nome, String idade) {
        System.out.println("Bem vindo " + nome + " sua idade é " + idade);
    }


}
