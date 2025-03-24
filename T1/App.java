public class App {
    
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Arthur", "97620795");
        Cliente cliente2 = new Cliente("Adriano", "98062440");
        Cliente cliente3 = new Cliente("Kindel", "93426666");
        Cliente cliente4 = new Cliente("Lucas", "98925853");

        Produto produto1 = new Produto("12345", "Frango", 30.00);
        Produto produto2 = new Produto("678910", "Ovo", 40.00);
        Produto produto3 = new Produto("109876", "Arroz", 15.00);
        Produto produto4 = new Produto("54321", "Carne", 30.00);

        Venda venda1 = new Venda(cliente1);
        Venda venda2 = new Venda(cliente2);
        Venda venda3 = new Venda(cliente3);
        Venda venda4 = new Venda(cliente4);

        venda1.inserir(1, produto1);  
        venda1.inserir(2, produto2);  

        venda2.inserir(3, produto3);  
        venda2.inserir(1, produto4);  

        venda3.inserir(2, produto1); 
        venda3.inserir(1, produto3);  

        venda4.inserir(4, produto4); 

        System.out.println("\n===== Nota Fiscal =====");

        System.out.println(cliente1);
        System.out.println(venda1);

        System.out.println(cliente2);
        System.out.println(venda2);

        System.out.println(cliente3);
        System.out.println(venda3);

        System.out.println(cliente4);
        System.out.println(venda4);

    }
}
