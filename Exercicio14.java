import java.util.Scanner;

public class Exercicio14 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 numeros: ");
        for(int i = 0; i < 5; i++) {
            vetor[i] = leitor.nextInt();
        }

        int maxElemento = vetor[0];
        int maxPosicao = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > maxElemento) {
                maxElemento = vetor[i];
                maxPosicao = i;
            }
        }

        int temp = vetor[4];
        vetor[4] = maxElemento;
        vetor[maxPosicao] = temp;

        System.out.println("Vetor atualizado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }

        leitor.close();
    }

}
