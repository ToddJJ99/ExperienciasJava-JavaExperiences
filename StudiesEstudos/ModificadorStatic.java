public class ModificadorStatic {

    public static void main(String[] args) {
        Conta contaJoao = new Conta();
        Conta contaMaria = new Conta();

        // static: quando nao precisa de objeto
        contaJoao.depositarContaConjunta(100.0);
        contaMaria.depositarConta(100.0);
         
        System.out.println(Conta.saldoContaConjunta);
        System.out.println(contaJoao.saldo);
        System.out.println(contaMaria.saldo);
    }
}