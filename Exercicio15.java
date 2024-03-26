import java.util.Scanner;

public class Exercicio15 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite o 1º número:");
        vetor[0] = leitor.nextInt();

        int i = 1;
        do {
            System.out.println("Digite o próximo número maior que " + vetor[i - 1] + ":");
            int num = leitor.nextInt();
            if (num > vetor[i - 1]) {
                vetor[i] = num;
                i++;
            } else {
                System.out.println("O número digitado deve ser maior que " + vetor[i - 1] + ". Digite novamente:");
            }
        } while (i < 5);

        System.out.println("Vetor preenchido:");
        for (int j = 0; j < 5; j++) {
            System.out.print(vetor[j] + " ");
        }

        leitor.close();
    }

}
