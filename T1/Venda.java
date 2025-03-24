import java.util.ArrayList;
import java.util.List;

public class Venda {

    private List<ItemVenda> itens;
    
    public Venda(Cliente cliente1){
        this.itens = new ArrayList<ItemVenda>();
    }

    public void inserir(Produto produto){
        this.itens.add(new ItemVenda(1, produto));
    }

    public void inserir(int umaQtde, Produto produto){
        this.itens.add(new ItemVenda(umaQtde, produto));
    }

    public double valorTotal(){
        double total = 0;
        for(ItemVenda item: itens){
            total += item.getValor();
        }
        return  total;
    }


    // Essa parte do toString foi alterada no chatgpt /
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("----- Carinho: -----\n");
        for (ItemVenda item : itens) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Valor Total do carinho: R$ ").append(String.format("%.2f", valorTotal()));
        return sb.toString();
    }
}
