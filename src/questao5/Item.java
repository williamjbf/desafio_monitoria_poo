package questao5;

public class Item {

    private Produto produto;
    private int quantidade;


    public Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double valorTotal(){
        return produto.getPrecoUnitario() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return produto.getCodigo() + " - " + produto.getNome() + " - " + quantidade;
    }
}
