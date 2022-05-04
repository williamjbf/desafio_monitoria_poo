package questao3;

public class Questao3 {

    public Questao3(){
        System.out.println("///////// QUESTÃO 3 /////////");  
      
        FormaGeometrica quadrado = new Quadrado(5);
        FormaGeometrica retangulo = new Retangulo(5,10);
        FormaGeometrica triangulo = new Triangulo(10,5);
        FormaGeometrica circulo = new Circulo(2);

        System.out.println("Area do quadrado: " + quadrado.area());
        System.out.println("Area do retangulo: "+retangulo.area());
        System.out.println("Area do triangulo:" +triangulo.area());
        System.out.println("Area do circulo:"+circulo.area());

        System.out.println("//////////////////");
        System.out.print("\n");
    }

}
