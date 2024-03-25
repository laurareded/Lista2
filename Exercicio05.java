import java.util.Scanner;

public class Exercicio05 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 numeros: ");
        for(int i = 0; i < 5; i++) {
            numeros[i] = leitor.nextInt();
        }

        System.out.println("Digite outro numero que sera chamado de n: ");
        int n = leitor.nextInt();

        int contador = 0;

        for(int i = 0; i < 5; i++) {
            if(numeros[i] == n) {
                contador++;
            }
        }

        System.out.println("O numero " + n + " aparece " + contador + " vezes no vetor" );

        leitor.close();
    }

}
