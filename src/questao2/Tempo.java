package questao2;

public class Tempo {

    private int segundos;
    private static final int segundosHora = 3600;
    private static final int segundosMinutos = 60;

    public Tempo(int segundos){
        this.segundos = segundos;
    }

    public int segundosEmHoras(){
        return this.segundos/segundosHora;
    }

    public int segundosEmMinutos(){
        return (this.segundos - segundosEmHoras()*segundosHora)/segundosMinutos;
    }

    public int segundos(){
        return this.segundos -(segundosEmHoras()*segundosHora + segundosEmMinutos()*segundosMinutos);
    }

    @Override
    public String toString() {
        return  "Horas: " + segundosEmHoras() + "\n"+
                "Minutos: " + segundosEmMinutos() + "\n"+
                "Segundos: " + segundos();
    }
}
