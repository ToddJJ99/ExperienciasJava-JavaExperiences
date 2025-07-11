public class metodos {
    public static void main(String[] args) {   
        ativarSoneca();
        String mensagemDoAlarme = agendarAlarme(12,30);
        System.out.println(mensagemDoAlarme);
    }
    static void ativarSoneca() {
    System.out.println("Só mais 5 minutinhos :P");
    }

    static String agendarAlarme(int hora, int minuto) {
        return "Seu alarme foi configurado às " + hora + ":" + minuto;
    }
}
