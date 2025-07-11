public class Stringbasics {
    public static void main(String[] args) {

        //apontam para lugares diferentes, false
        String str1 = new String("java s2");
        String str2 = new String("java s2");

        System.out.println(str1 == str2);

        //apontam para o mesmo lugar, true
        String str3 = "java s2";
        String str4 = "java s2";

        System.out.println(str3 == str4);

        //pula uma linha e printa e um tab entre as palavras
        System.out.println("\njava\ts2");

        String nome = "Arthur Araujo";

        //charat utilizado para pegar/se referenciar a alguma letra da plavara
        System.out.println("primeira letra do nome: " + nome.charAt(0));

        //indexof usado para achar uma letra
        System.out.println("Posiçao letra A no nome: " + nome.indexOf("a"));

        //pega o sobrenome atravez do espaço
        int posicaosobrenome = nome.indexOf("") + 1;
        System.out.println("sobrenome: " + nome.substring(posicaosobrenome));

        //ve a quantidade de caracteres no texto junto com os espaços
        System.out.println("numero de letras no nome:" + (nome.length() - 1));

        //substituir caracteres troca todos os a por 1
        System.out.println(nome.replaceAll("A", "1"));
    }
}
