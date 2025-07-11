public class app {

    public static void main(String[] args) {
            Calculadora calculadora = new Calculadora(1.5, 3.5);
            Calculadora calculadora2 = new Calculadora(1.5, 3.5);
            Calculadora calculadora3 = new Calculadora(1.5, 3.5);
            
            System.out.println(calculadora.soma());
            System.out.println(calculadora2.soma());
            System.out.println(calculadora3.soma());

            System.out.println(
                calculadora.num1.equals(calculadora2.num1)
            );
    }
}
