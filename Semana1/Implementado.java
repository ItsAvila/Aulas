public class Implementado {
    
    public static void main(String[] args) {
        
        Circulo[] circulos = new Circulo[3];
        circulos[0] = new Circulo(2, 3, 5);
        circulos[1] = new Circulo();
        circulos[2] = new Circulo(-1, -4, -2);

        System.out.println("Círculos Iniciais: ");
        for (Circulo circulo : circulos) {
            System.out.println(circulo);
        }

        // Aplicando transformações
        circulos[0].mover(4, 4);
        circulos[1].aplicarZoom(2);
        circulos[2].mover(0, 0);
        circulos[2].aplicarZoom(1.5);
         
        // Exibindo os círculos após alterações
        System.out.println("\nCírculos após transformações:");
        for (Circulo circulo : circulos) {
            System.out.println(circulo);
        }
    }
}