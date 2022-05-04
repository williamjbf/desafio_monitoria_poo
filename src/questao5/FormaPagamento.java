package questao5;

public enum FormaPagamento {
    DINHEIRO("dinheiro"), CREDITO("credito"), CHEQUE("cheque");

    private String pagamento;

    FormaPagamento(String  pagamento){
        this.pagamento =pagamento;
    }

    public String getPagamento(){
        return pagamento;
    }
}
