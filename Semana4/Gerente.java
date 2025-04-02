// Gerente.java - Gerente herda de Funcionario e implementa o método calcularBonificacao
class Gerente extends Funcionario{

    private String senha;
    private int qtdPessoasGerenciadas;
    private double salario;

    public void preencher(String nome, int idade, String cpf, double salario, String senha, int qtdPessoasGerenciadas){
        super.preencher(nome, idade, cpf);
        this.senha = senha;
        this.qtdPessoasGerenciadas = qtdPessoasGerenciadas;
    }

    @Override
    public double calcularBonificacao(int metasAtingidas){
        return salario * 0.15 * metasAtingidas;
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Senha: " + senha);
        System.out.println("Quantidade de pessoas gerenciadas: " + qtdPessoasGerenciadas);
    }
}