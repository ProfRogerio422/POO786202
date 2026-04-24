public class Funcionario {

    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }




    public double getSalario() {
        return salario;
    }

    public void atualizarSalario(double porcentagem) {

        salario = salario
                + (salario * porcentagem);


    }




}
