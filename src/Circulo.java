public class Circulo extends Forma {
    public Circulo(Color color){
        super(color);
    }

    @Override
    void dibujar(){
        System.out.println("Dibujando un circulo");
        color.aplicarColor();
    }
    
}
