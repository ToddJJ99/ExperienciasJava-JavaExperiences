import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        Double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo numero: ");
        Double num2 = teclado.nextDouble();

        System.out.println("Escolha o tipo de operação: ");
        System.out.println("1 : Soma ");
        System.out.println("2 : Subtração ");
        System.out.println("3 : Multiplicação ");
        System.out.println("4 : Divisão ");
        int escolha = teclado.nextInt(); 


        switch (escolha) {
            case 1:
                System.out.println("O resultado é: " + (num1 + num2));
                break;
        
            case 2:
            System.out.println("O resultado é: " + (num1 - num2));
            break;

            case 3:
            if (num2 == 0) {
                System.out.println("Erro: Não é possivel multiplicar por zero.");
                break;
            }
            System.out.println("O resultado é: " + (num1 * num2));
            break;

            case 4:
            if (num2 == 0) {
                System.out.println("Erro: Não é possivel dividir por zero.");
                break;
            }
            System.out.println("O resultado é: " + (num1 / num2));
            break;

            default:
            System.out.println("Error");
                break;
        }

        teclado.close();

    }
}