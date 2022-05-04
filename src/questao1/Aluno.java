package questao1;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private List<Nota> notas = new ArrayList<>();
    private String status;

    public void adicionarNota(Double nota){
        this.notas.add(new Nota(nota));
        this.atulizarStatus();
    }

    public List<Nota> buscarTodasAsNotas(){
        return this.notas;
    }

    public Nota buscarNota(int index){
        return this.notas.get(index);
    }

    public double media(){
        double media = 0;
        for(Nota nota:notas){
            media += nota.getNota();
        }
        return media / notas.size();
    }

    public String getStatus(){
        return this.status;
    }

    private void atulizarStatus(){
        double media = media();
        if(media >= 6){
            this.status= "Aprovado";
        } else if (media < 4) {
            this.status = "Reprovado";
        }else {
            this.status = "Reposição da menor nota";
        }
    }

}
