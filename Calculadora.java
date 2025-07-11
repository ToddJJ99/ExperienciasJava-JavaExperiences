public class Calculadora {

    Double num1;
    Double num2;

    public Calculadora(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    Double soma() {
        return num1 + num2;
    }
}