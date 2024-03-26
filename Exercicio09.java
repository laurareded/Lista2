import java.util.Scanner;

public class Exercicio09 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite 5 numeros para o primeiro vetor: ");
        for(int i = 0; i < 5; i++) {
            A[i] = leitor.nextInt();
        }

        System.out.println("Digite 5 numeros para o segundo vetor: ");
        for(int i = 0; i < 5; i++) {
            B[i] = leitor.nextInt();
        }

        int[] C = new int[5];

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { 
                C[i] = A[i];
            }
            else { 
                C[i] = B[i];
            }
        }

        System.out.print("Vetor C: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }

        leitor.close();

            
    }

}
