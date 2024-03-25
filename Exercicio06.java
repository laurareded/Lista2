import java.util.Scanner;

public class Exercicio06 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[5];
        double[] pesos = new double[5];

        System.out.println("Digite as notas das 5 provas: ");
        for(int i = 0; i < 5; i++) {
            notas[i] = leitor.nextDouble();
        }

        System.out.println("Digite o peso de cada prova na mesma ordem: ");
        for(int i = 0; i < 5; i++) {
            pesos[i] = leitor.nextDouble();
        }

        double soma = 0;
        double somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = soma / somaPesos;
        
        System.out.println("A média ponderada do aluno é: " + mediaPonderada);

        leitor.close();

    }

}
