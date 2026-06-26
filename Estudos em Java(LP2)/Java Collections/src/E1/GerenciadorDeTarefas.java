package E1;
import java.util.Scanner;
import java.util.ArrayList;
public class GerenciadorDeTarefas {
    Scanner ler = new Scanner(System.in);
    ArrayList<String> listaDeTarefas = new ArrayList<>();

    public void mostrarListaDeTarefas(){
        System.out.println();
        for(String tarefa: listaDeTarefas){
            System.out.println(tarefa);
        }
        System.out.println();
    }

    public void adicionarTarefa(){
        String tarefa;
        System.out.println("Qual tarefa deseja adicionar?");
        tarefa = ler.nextLine();
        listaDeTarefas.add(tarefa);
        mostrarListaDeTarefas();
    }

    public void remvoerPrimeiro(){
        if(!listaDeTarefas.isEmpty()){
            listaDeTarefas.removeFirst();
            mostrarListaDeTarefas();
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void removerIndice(){
        String indice;
        mostrarListaDeTarefas();
        System.out.println("Deseja remover qual tarefa?");
        indice = ler.nextLine();
        if(!listaDeTarefas.isEmpty() && listaDeTarefas.contains(indice)){
            listaDeTarefas.remove(indice);
            mostrarListaDeTarefas();
            System.out.println("tarefa: "+indice+" removido.");
        }else{
            System.out.println("Indice não preenchido ou lista vazia.");
        }
    }

    public void verificarSeTem(String tarefa){
        if(listaDeTarefas.contains(tarefa)){
            System.out.println("A tarefa: "+tarefa+" está na lista.");
        }else{
            System.out.println("A tarefa: "+tarefa+" não na lista.");
        }
    }
}
