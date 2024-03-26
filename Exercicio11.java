import java.util.Scanner;

public class Exercicio11 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite 5 numeros: ");
        for(int i = 0; i < 5; i++) {
            A[i] = leitor.nextInt();
        }

        System.out.println("Digite 5 numeros: ");
        for(int i = 0; i < 5; i++) {
            B[i] = leitor.nextInt();
        }

        int produto = 0;

        for(int i = 0; i < 5; i++) {
            produto = produto + A[i] * B[i];
        }

        System.out.println("O produto escalar dos vetores e: " + produto);

        leitor.close();
    }

}
