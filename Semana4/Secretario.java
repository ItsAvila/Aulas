// Secretario.java - Secretario herda de Funcionario e não impplementa o método calcularBonificacao
class Secretario extends Funcionario{

    private double salario;

    public double calcularBonificacao(int metasAtingidas){
        return salario * 0.10 * metasAtingidas;
    }
}