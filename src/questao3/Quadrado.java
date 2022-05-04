package questao3;

public class Quadrado extends FormaGeometrica{

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }
}
