public class Exemplo02 {

    public static void main(String[] args) {
        // CRIANDO UM OBJETO PRODUTO 1
        Produto p1 = new Produto();
        p1.nome = "Teclado";
        p1.preco = 150;
        p1.quantidade = 10;

        // CRIANDO UM OBJETO PRODUTO 2
        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 50;
        p2.quantidade = 2;

        double valorTotalComprar
                = p1.valorTotal() + p2.valorTotal();
        System.out.println("Valor total da compra " + valorTotalComprar);
        System.out.println("Produtos");
        p1.mostrarInfo();
        p2.mostrarInfo();

        System.out.println("Produto 3");
        Produto p3 = new Produto("Monitor", 300, 2);
        p3.mostrarInfo();


    }
}
