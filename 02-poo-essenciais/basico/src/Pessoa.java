public class Pessoa {

    String nome;
    int idade;
    double altura;
    double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public boolean ehMaiorDeIdade() {
        if (idade >= 18) {
            return true;
        }
        return false;
    }

}
