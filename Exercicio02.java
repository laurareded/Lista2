import java.util.Scanner;

public class Exercicio02 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos numeros voce quer digitar? ");
        int quant = leitor.nextInt();

        int[] numeros = new int[quant];

        for(int i = 0; i < quant; i++) {
            System.out.println("Digite o numero: ");
            numeros[i] = leitor.nextInt();
        }

        for(int i = 0; i < quant; i++) {
            System.out.println("Numero na posicao " + i);
            System.out.println("e: " + numeros[i]);
        }

        System.out.println("Numeros negativos: ");
        for(int i = 0; i < quant; i++) {
            if(numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Numeros positivos: ");
        for(int i = 0; i < quant; i++) {
            if(numeros[i] > 0) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Numeros iguais a zero: ");
        for(int i = 0; i < quant; i++) {
            if(numeros[i] == 0) {
                System.out.println(numeros[i]);
            }
        }

        leitor.close();


    }

}
