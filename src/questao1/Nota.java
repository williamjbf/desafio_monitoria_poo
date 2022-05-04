package questao1;

public class Nota {

    private double nota;

    public Nota(Double nota){
        validarValorPositivo(nota);
        this.nota = nota;
    }

    private void validarValorPositivo(Double nota){
        if (nota < 0) throw new IllegalArgumentException("O valor da nota não pode ser negativo");
    }

    public double getNota() {
        return nota;
    }
}
