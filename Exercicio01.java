import java.util.Scanner;

public class Exercicio01 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o numero: ");
            numeros[i] = leitor.nextInt();
        }

        int soma = 0;
        for(int i = 0; i < 5; i++) {
            soma = soma + numeros[i];
        }

        double media = soma / 5;

        System.out.println("Media: " + media);

        System.out.println("Valores menores que a media: ");
        for(int i = 0; i < 5; i++) {
            if(numeros[i] < media) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Valores maiores que a media: ");
        for(int i = 0; i < 5; i++) {
            if(numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Valores iguais a media: ");
        for(int i = 0; i < 5; i++) {
            if(numeros[i] == media) {
                System.out.println(numeros[i]);
            }
        }

        leitor.close();

    }

    }


