// Engenheiro.java - Engenheiro herda de Funcionario e implementa o método calcularBonificacao
class Engenhario extends Funcionario{
    
    private double salario;

    @Override
    public double calcularBonificacao(int metasAtingidas){
        return salario * 0.12 * metasAtingidas;
    }
}