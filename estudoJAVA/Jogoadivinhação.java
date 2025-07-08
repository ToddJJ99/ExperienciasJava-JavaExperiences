import java.util.Scanner;
import java.util.Random;

public class Jogoadivinhação {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("==== Jogo de Adivinhação ====");
        System.out.println("1: Jogador adivinha o número");
        System.out.println("2: Computador adivinha o número que você pensou");
        System.out.print("Escolha o modo: ");
        int escolha = teclado.nextInt();

        if (escolha == 1) {
            int numeroSorteado = gerador.nextInt(10) + 1; 
            int tentativa;

            System.out.print("Tente adivinhar o número entre 1 e 10: ");
            tentativa = teclado.nextInt();

            if (tentativa == numeroSorteado) {
                System.out.println("Você adivinhou o número!! Parabéns!");
            } else {
                System.out.println("Errou! O número era: " + numeroSorteado);
            }

        } else if (escolha == 2) {
            int min = 1;
            int max = 10;
            int tentativas = 0;
            boolean acertou = false;

            System.out.println("Pense em um número de 1 a 10 e NÃO DIGA em voz alta.");
            System.out.println("Quando estiver pronto, digite qualquer coisa e aperte Enter...");
            teclado.next(); 

            while (!acertou && min <= max) {
                int palpite = (min + max) / 2;
                tentativas++;

                System.out.println("O computador acha que é: " + palpite);
                System.out.print("Digite 'maior', 'menor' ou 'acertou': ");
                String resposta = teclado.next().toLowerCase();

                if (resposta.equals("maior")) {
                    min = palpite + 1;
                } else if (resposta.equals("menor")) {
                    max = palpite - 1;
                } else if (resposta.equals("acertou")) {
                    acertou = true;
                    System.out.println("Acertei em " + tentativas + " tentativa(s)!");
                } else {
                    System.out.println("Resposta inválida. Tente novamente.");
                }
            }

            if (!acertou) {
                System.out.println("Você mentiu em algum momento, né? kkkkk");
            }
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }

        teclado.close();
    }
}
