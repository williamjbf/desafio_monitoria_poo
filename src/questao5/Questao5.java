package questao5;

public class Questao5 {

    public Questao5(){

        System.out.println("///////// QUESTÃO 5 /////////");
        System.out.println();

        System.out.println("Lista de produtos do supermercado");
        Produto produto1 = new Produto(1,"Maca",100,1);
        Produto produto2 = new Produto(2,"Pera",100,1);
        Produto produto3 = new Produto(3,"Manga",100,1);
        Produto produto4 = new Produto(4,"Chocolate",100,1);

        Supermercado supermercado = new Supermercado();
        supermercado.adicionarProduto(produto1);
        supermercado.adicionarProduto(produto2);
        supermercado.adicionarProduto(produto3);
        supermercado.adicionarProduto(produto4);

        System.out.println(supermercado.listarProdutos());

        Cliente cliente = new Cliente(100000,FormaPagamento.DINHEIRO);

        cliente.adicionarCarrinho(produto1,10);
        cliente.adicionarCarrinho(produto2,20);
        cliente.adicionarCarrinho(produto3,50);
        cliente.adicionarCarrinho(produto4,100);

        System.out.println("Lista do carrinho do cliente");
        System.out.println(cliente.listarCarrinho());

        System.out.println("Lista do carrinho do pedido com os descontos");
        double valorCompra = supermercado.fecharCompra(cliente.carrinho);
        cliente.pagarCompra(valorCompra, cliente.formaPagamento);

        System.out.println("//////////////////");
    }

}
