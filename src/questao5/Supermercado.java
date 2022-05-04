package questao5;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    List<Produto> produtos = new ArrayList<>();


    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public double fecharCompra(List<Item> carrinho){

        StringBuilder sb = new StringBuilder();
        sb.append("Cod - Nome - Valor total item\n");

        double valorTotalCompra = 0;

        for (Item item:carrinho){
            double valorItem = 0;

            valorItem += item.valorTotal() * deconto(item.getQuantidade());

            sb.append(exibirItem(item, valorItem));
            sb.append("\n");

            item.getProduto().diminuirEstoque(item.getQuantidade());

            valorTotalCompra += valorItem;
        }
        System.out.println(sb.toString());
        return valorTotalCompra;
    }

    private String exibirItem(Item item, double valor) {
        return item.getProduto().getCodigo() + " - " +item.getProduto().getNome() + " - " + valor;
    }

    public String listarProdutos(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cod - Nome - Estoque\n");
        for(Produto produto:produtos){
            sb.append(produto.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    private double deconto(int quantidade){
        if (quantidade <=10){
            return 1;
        }else if (quantidade <=20){
            return 0.9;
        }else if(quantidade <= 50){
            return 0.8;
        }else {
            return 0.75;
        }

    }

}
