import java.util.Scanner;

public class Exercicio03 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite quantos numeros voce quer digitar: ");
        int quant = leitor.nextInt();

        int[] numeros = new int[quant];

        for(int i = 0; i < quant; i++) {
            System.out.println("Digite o numero: ");
            numeros[i] = leitor.nextInt();
        }

        int[] dobro = new int[quant];

        for(int i = 0; i < quant; i++) {
            dobro[i] = numeros[i] * 2;
        }

        System.out.println("Dobro dos valores: ");
        for(int i = 0; i < quant; i++) {
            System.out.println(dobro[i]);
        }

        leitor.close();

    }

}
