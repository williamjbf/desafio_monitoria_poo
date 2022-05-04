package questao1;

public class Questao1 {

    public Questao1() {
        System.out.println("///////// QUESTÃO 1 /////////");
        Aluno aluno = new Aluno();

        aluno.adicionarNota(6.0);
        System.out.println("Status aluno: " + aluno.getStatus());
        aluno.adicionarNota(4.0);
        System.out.println("Status aluno: " + aluno.getStatus());
        aluno.adicionarNota(0.0);
        System.out.println("Status aluno: " + aluno.getStatus());
        try {
            aluno.adicionarNota(-10.0);
            System.out.println(aluno.getStatus());
        }catch (Exception e){
            System.out.println("O ERRO É ESPERADO jÀ QUE FOI TENTNADO PASSAR VALORES NEGATIVOS");
            e.printStackTrace();
        }
        System.out.println("//////////////////");
        System.out.print("\n");

    }
}
