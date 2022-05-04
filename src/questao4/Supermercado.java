package questao4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    List<Produto> produtos = new ArrayList<>();


    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public double fecharCompra(List<Item> carrinho){

        double valorCompra = 0;
        for (Item item:carrinho){
            valorCompra += item.valorTotal();
            item.getProduto().diminuirEstoque(item.getQuantidade());
        }
        
        return valorCompra;
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

}
