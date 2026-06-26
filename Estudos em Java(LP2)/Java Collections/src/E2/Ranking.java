package E2;
import java.util.TreeSet;
import java.util.Scanner;

public class Ranking {
    Scanner ler = new Scanner(System.in);
    TreeSet<Integer> pontuacoes = new TreeSet<>();

    public void adicionarPontuacao(){
        int pontuacao;
        System.out.println("Qual a pontuaçao do jogador "+pontuacoes.size());
        pontuacao = ler.nextInt();
        pontuacoes.add(pontuacao);
    }
    public void exibirPontuacao(){
        if(!pontuacoes.isEmpty()){
            System.out.print(pontuacoes);
        }else{
            System.out.println("Lista vazia!");
        }
    }
    public void exibirPontuacaoAoContrario(){
        if(!pontuacoes.isEmpty()){
            System.out.print(pontuacoes.descendingSet());
    }else{
            System.out.println("Lista vazia!");
        }
    }
}
