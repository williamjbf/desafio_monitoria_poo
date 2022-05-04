package questao2;

import java.util.Scanner;

public interface Leitor{

    default int leituraInteiro(){
        Scanner scan = new Scanner(System.in);
        int inteiro = scan.nextInt();
        return inteiro;
    }
}
