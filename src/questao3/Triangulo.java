package questao3;

public class Triangulo extends FormaGeometrica{

    private double altura;
    private double base;

    public Triangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }


    @Override
    public double area() {
        return (this.altura * this.base) / 2;
    }
}
