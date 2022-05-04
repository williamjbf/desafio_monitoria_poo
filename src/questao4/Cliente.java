package questao4;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    List<Item> carrinho = new ArrayList<>();
    FormaPagamento formaPagamento;
    double saldo;

    public Cliente(double saldo,FormaPagamento formaPagamento){
        this.saldo = saldo;
        this.formaPagamento = formaPagamento;
    }

    public void adicionarCarrinho(Produto produto, int quantidade){
        carrinho.add(new Item(produto,quantidade));
    }

    public List<Item> getCarrinho(){
        return this.carrinho;
    }

    public String listarCarrinho(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cod - Nome - Quantidade\n");
        for(Item item:carrinho){
            sb.append(item.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean pagarCompra(double valorCompra, FormaPagamento formaPagamento) {
        if(this.saldo >= valorCompra){
            System.out.println("Compra de R$"+ valorCompra + " paga com " + formaPagamento.getPagamento());
            this.saldo -= valorCompra;
            return true;
        }else {
            return false;
        }
    }
}
