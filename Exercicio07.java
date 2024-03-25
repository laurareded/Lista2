import java.util.Scanner;

public class Exercicio07 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] vetor1 = new int[5];

        System.out.println(" Digite 5 numeros: ");
        for(int i = 0; i < 5; i++) {
            vetor1[i] = leitor.nextInt();
        }

        int[] vetor2 = new int[5];

        System.out.println("Digite 5 numeros: ");
        for(int i = 0; i < 5; i++) {
            vetor2[i] = leitor.nextInt();
        }

        if(vetor1[0] == vetor2[0] && vetor1[1] == vetor2[1] && vetor1[2] == vetor2[2] &&
        vetor1[3] == vetor2[3] && vetor1[4] == vetor2[4]) {
            System.out.println("Os vetores sao iguais");
        }
        else {
            System.out.println("Os vetores nao sao iguais");
        }

        leitor.close();
    }

}
