public class App {
    public static void main(String[] args) throws Exception {
        Forma circuloRojo = new Circulo(new RedColor());
        Forma cuadradoAzul = new Cuadrado(new ColorAzul());

        circuloRojo.dibujar();
        cuadradoAzul.dibujar();
    }
}
