// Diretor.java - Diretor herda de Funcionario e implementa o método calcularBonificacao
class Diretor extends Funcionario{

    private String senha;
    private double salario;

    public void preencher(String nome, int idade, String cpf, double salario, String senha){
        super.preencher(nome, idade, cpf, salario);
        this.senha = senha;
    }

    @Override
    public double calcularBonificacao(int metasAtingidas){
        return salario * 0.20 * metasAtingidas;
    }
    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Senha: " + senha);
    }
}