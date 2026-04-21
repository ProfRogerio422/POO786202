public class Exemplo04 {

    public static void main(String[] args) {

        Produto produto = new Produto("Teclado",
                150, 10);

        Produto p1 = new Produto();
        p1.nome = "Teclado";
        p1.preco = 150;
        p1.quantidade = 10;

        System.out.println("Nome do p1 " + p1.nome);

        System.out.println(produto.nome);


    }
}
