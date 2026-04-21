import java.util.ArrayList;
import java.util.List;

public class Exemplo03 {

    public static void main(String[] args) {

        List<Produto> pedidos = new ArrayList<>();

        // Adicionandos produtos
        pedidos.add(new Produto("Teclado", 150, 10));
        pedidos.add(new Produto("Mouse", 50, 20));
        pedidos.add(new Produto("Monitor", 500, 2));

        System.out.println("Lista de pedidos");
        double valorTotalCompra = 0;
        for (Produto p : pedidos) {
            System.out.println(p.nome + " - Preço :" +
                    p.preco + " - Quantidade:" + p.quantidade);
            System.out.println("Valor total: " + p.valorTotal());
            valorTotalCompra = valorTotalCompra + p.valorTotal();
        }

        System.out.println("Valor a pagar: " + valorTotalCompra);




    }
}
