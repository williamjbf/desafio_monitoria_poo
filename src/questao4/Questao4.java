package questao4;

public class Questao4 {

    public Questao4(){

        System.out.println("///////// QUESTÃO 4 /////////");
        System.out.println();

        System.out.println("Lista de produtos do supermercado");
        Produto produto1 = new Produto(1,"Maca",10,0.85);
        Produto produto2 = new Produto(2,"Pera",8,0.6);
        Produto produto3 = new Produto(3,"Manga",6,0.89);
        Produto produto4 = new Produto(4,"Chocolate",6,2.5);

        Supermercado supermercado = new Supermercado();
        supermercado.adicionarProduto(produto1);
        supermercado.adicionarProduto(produto2);
        supermercado.adicionarProduto(produto3);
        supermercado.adicionarProduto(produto4);

        System.out.println(supermercado.listarProdutos());

        Cliente cliente = new Cliente(100,FormaPagamento.DINHEIRO);

        cliente.adicionarCarrinho(produto1,2);
        cliente.adicionarCarrinho(produto2,3);
        cliente.adicionarCarrinho(produto3,1);

        System.out.println("Lista do carrinho do cliente");
        System.out.println(cliente.listarCarrinho());

        double valorCompra = supermercado.fecharCompra(cliente.carrinho);
        cliente.pagarCompra(valorCompra, cliente.formaPagamento);

        System.out.println("\nLista dos produtos do supermercado atualizada");
        System.out.println(supermercado.listarProdutos());

        System.out.println("//////////////////");
        System.out.print("\n");
    }

}
