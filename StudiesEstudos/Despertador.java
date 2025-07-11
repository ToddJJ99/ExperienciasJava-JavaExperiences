public class Despertador {
    int horas;
    int minutos;
    int soneca;

    void ativarSoneca() {
        System.out.println("Só mais "+ soneca + " minutinhos :P");
    }

    String agendarAlarme(int hora, int minuto) {
        return "Seu alarme foi configurado às " + hora + ":" + minuto;
    }

}


