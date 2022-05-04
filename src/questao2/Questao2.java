package questao2;

public class Questao2 implements Leitor{

    public Questao2(){

        System.out.println("///////// QUESTÃO 2 /////////");

        System.out.println("Digite o tempo em segundos: ");
        int segundosTerminal = leituraInteiro();

        Tempo tempo = new Tempo(segundosTerminal);
        System.out.println(tempo);
      
        System.out.println("//////////////////");
        System.out.print("\n");
    }
}
