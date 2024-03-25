import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] A = {10, 20, 30, 40, 50};
        int[] B = {5, 10, 15, 20, 25};

        System.out.println("Vetor A: " + Arrays.toString(A));

        System.out.println("Vetore B: " + Arrays.toString(A));

        int[] C = new int[A.length + B.length];
        
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }
        
        System.out.println("Vetor C (concatenação de A e B): " + Arrays.toString(C));

        leitor.close();
    }


}
