package Semana2;

public class POOKon {
    
    public static void main(String[] args) {
        
        /* Criando um carro */
        Carro carro = new Carro();
        carro.setPlaca("ABC-1234");

        /* Criando um cliente */
        Cliente cliente = new Cliente();
        cliente.setNome("Arthur");

        /* Criando uma venda */
        Venda venda = new Venda();
        venda.setValor(1000);
        venda.setCliente(cliente);
        venda.setCarro(carro);

        /* Exibindo os detalhes */
        System.out.println("Valor: " + venda.getValor());
        System.out.println("Cliente: " + venda.getCliente().getNome());
        System.out.println("Carro: " + venda.getCarro());
    }
}
