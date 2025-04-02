// Pessoa.java - Classe abstrata para representar uma pessoa
public class Pessoa {
    
    private String nome;
    private int idade;
    private String cpf;

    public void preencher(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }
}