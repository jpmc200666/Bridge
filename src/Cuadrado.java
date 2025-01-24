public class Cuadrado extends Forma{
    public Cuadrado (Color color){
        super(color);
    }

    @Override
    void dibujar(){
        System.out.println("Dibujando un cuadrado");
        color.aplicarColor();
    }
}
