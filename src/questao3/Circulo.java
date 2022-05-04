package questao3;

public class Circulo extends FormaGeometrica{

    private final static double pi = Math.PI;
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double area() {
        return pi * Math.pow(raio,2);
    }
}
