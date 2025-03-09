package Semana2;

public class Carro {
    
    /* Atributo privado */
    private String placa;

    /* Construtor com parâmetro */
    public Carro(String placa) {
        this.placa = placa;
    }

    /* Construtor padrão */
    public Carro() {}

    /* Método para pegar a Placa */
    public String getPlaca() {
        return placa;
    }

    /* Método para definir a placa */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /* Representação em string */
    @Override
    public String toString() {
        return "Placa: " + placa;
    }
}
