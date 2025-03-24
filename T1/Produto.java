public class Produto {
    
    private String codigo;
    private String nome;
    private double preco;

    public Produto(String umCodigo, String umNome, double umPreco) {
        this.codigo = umCodigo;
        this.nome = umNome;
        this.preco = umPreco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Código: " + codigo + " | Preço: R$ " + String.format("%.2f", preco);
    }
}
