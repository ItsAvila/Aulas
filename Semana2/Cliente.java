package Semana2;

public class Cliente {
    
    /* Atributo privado */
    private String nome;

    /* Construtor com parâmetro */
    public Cliente(String nome) {
        this.nome = nome;
    }

    /* Construtor padrão */
    public Cliente() {}

    /* Método para pegar o nome */
    public String getNome() {
        return nome;
    }

    /* Método para definir o nome */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
