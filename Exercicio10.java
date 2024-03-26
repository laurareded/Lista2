import java.util.Scanner;

public class Exercicio10 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        
        System.out.println("Digite 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            A[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            B[i] = A[4 - i];
        }
    
        System.out.print("Numeros digitados ao contrario: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }
    }

}
