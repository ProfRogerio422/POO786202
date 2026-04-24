public class Funcionario {

    String nome;
    int horasTrabalhadas;
    private double valorHora;
    double desconto;

    Funcionario(String nome, int horas, double valorHora, double desconto) {
        this.nome = nome;
        this.horasTrabalhadas = horas;
        this.valorHora = valorHora;
        this.desconto = desconto;
    }

    public void setValorHora(double valorHora) {

        if (valorHora < 0) {
            System.out.println("Valor invalido");
        } else {
            this.valorHora = valorHora;
        }

    }

    double calcularSalarioBruto() {
        return horasTrabalhadas * valorHora;
    }

    double calcularSalarioLiquido() {
        return calcularSalarioBruto() - desconto;
    }

    void imprimirResumo() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário bruto: R$ " + calcularSalarioBruto());
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + calcularSalarioLiquido());
    }
}
