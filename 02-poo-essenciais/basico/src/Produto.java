public class Produto {

    // Caracteristicas
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco,
                   int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        System.out.println("Objeto criado com sucesso");
    }

    public Produto() {
        System.out.println("Objeto Criado");
    }

    // Comportamentos
    public double valorTotal(){
        return preco * quantidade;
    }

    public void mostrarInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço unitário: " + preco);
    }

}
