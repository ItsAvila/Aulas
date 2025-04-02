// Funcionario.java - Classe abstrata para representar um funcionário 
class Funcionario extends Pessoa {
    
    private double salario;

    public void preencher(String nome, int idade, String cpf, double salario){
        super.preencher(nome, idade, cpf);
        this.salario = salario;
    }

    // Método abstrato para calcular a bonificação implementado nas subclasses
    public double calcularBonificacao(int metasAtingidas){
        return salario * 0.10 * metasAtingidas;
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + salario);
    }
}