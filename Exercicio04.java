import java.util.Scanner;

public class Exercicio04 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        double[] numeros = new double[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o numero: ");
            numeros[i] = leitor.nextDouble();
        }

        System.out.println("Escolha outro numero qualquer que sera chamado de n: ");
        double n = leitor.nextDouble();

        System.out.println("Indice dos valores que sao menores que n: ");
        for(int i = 0; i < 5; i++) {
            if(numeros[i] < n) {
                System.out.println(i);
            }
        }

        leitor.close();

    }

}
