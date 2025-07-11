import java.util.ArrayList;
import java.util.Arrays;

public class arrays {
    
    public static void main(String[] args) {

        //sintaxe: <tipo> [] identificar = {valores aqui dentro}
        String [] tarefas = {"like ", "inscrever", "notificaçoes"};

        //sempre começar por 0 ou seja: like = 0 inscrever = 1 etc..
        System.out.println(tarefas[0]);
        System.out.println(tarefas.length);
        System.out.println(Arrays.toString(tarefas));//transforma o array em string
    

            //arraylist mais usado que o de cima
        ArrayList<String> tarefasdecasa = new ArrayList<>();
        tarefasdecasa.add("limpar a casa");
        tarefasdecasa.add("lavar banheiro");

        System.out.println(tarefasdecasa.get(0));
        System.out.println(tarefasdecasa);
    }

}
