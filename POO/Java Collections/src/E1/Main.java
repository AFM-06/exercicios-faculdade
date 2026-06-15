package E1;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador_andre = new GerenciadorDeTarefas();
        gerenciador_andre.adicionarTarefa();
        gerenciador_andre.adicionarTarefa();
        gerenciador_andre.adicionarTarefa();
        gerenciador_andre.adicionarTarefa();
        gerenciador_andre.mostrarListaDeTarefas();
        gerenciador_andre.removerIndice();
        gerenciador_andre.remvoerPrimeiro();
        gerenciador_andre.verificarSeTem("Surfar");

    }
}
