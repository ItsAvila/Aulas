public class Cliente {
    
    private String nome;
    private String codigo;

    public Cliente(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "\nCliente: " + nome + " | CPF: " + codigo;
    }
}
