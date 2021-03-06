package questao3;

public class Retangulo extends FormaGeometrica {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double area() {
        return this.altura * this.largura;
    }
}
