package Semana2;

public class Venda {
    
    private double valor;
    private Cliente cliente;
    private Carro carro;

    /* Construtor com parâmetros */
    public Venda(double valor, Cliente cliente, Carro carro) {
        this.valor = valor;
        this.cliente = cliente;
        this.carro = carro;
    }

    /* Construtor padrão */
    public Venda() {}

    /* Métodos Getters */
    public double getValor() {
        return valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    /* Métodos Setters */
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
