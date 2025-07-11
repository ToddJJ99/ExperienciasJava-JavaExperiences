import java.io.Console;
import java.util.Scanner;

public class Entradaesaida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome);
        scanner.close();

        //para ler textos
        Console console = System.console();
        System.out.println("Qual é o meu canal preferido? ");
        String canalp = console.readLine();
        System.out.println(canalp + ", é claro");
    }    
}
