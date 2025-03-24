public class ItemVenda {

    private int quantidade;
    private Produto produto;

    public ItemVenda(int umaQtde, Produto umProd) {
        this.quantidade = umaQtde;
        this.produto = umProd;
    }

    public double getValor() {
        return quantidade * produto.getPreco();
    }

    @Override
    public String toString() {
        return "Produto: " + produto.getNome() +  " | Quantidade: " + quantidade + " | Valor Total: R$ " + String.format("%.2f", getValor());
    }
}
