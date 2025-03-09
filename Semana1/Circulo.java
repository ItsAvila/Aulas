public class Circulo{
    
    /*Atributos  (PRIVADO)*/
    private double coordX;
    private double coordY;
    private double raio;

    /*Construtor do Circulo) */
    public Circulo(double coordX, double coordY, double raio){
        this.coordX = coordX;
        this.coordY = coordY;
        this.raio = raio;
    }

    /*Construtor do Circulo não recebendo parametros) */
    public  Circulo(){
        this(0, 0, 1);
    }

    /*Construtor para mover o circulo) */
    public void mover(double novoX, double novoY){
        this.coordX = novoX;
        this.coordY = novoY;
    }

    /*Construtor para aumentar o circulo) */
    public void aplicarZoom(double fator){
        if (fator > 0 ) {
            this.raio *= fator;
        }
    }

    /*Construtor para calcular area  do circulo) */
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    /*Construtor para String do circulo) */
    public String toString() {
        return String.format("Circulo [Centro: (%.2f, %.2f), Raio: %.2f, Área: %.2f]", coordX, coordY, raio, calcularArea());
    }
}