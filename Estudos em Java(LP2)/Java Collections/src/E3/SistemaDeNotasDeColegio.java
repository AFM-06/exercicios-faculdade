package E3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaDeNotasDeColegio {
    Scanner ler = new Scanner(System.in);
    HashMap<String,Double> boletinho = new HashMap<String, Double>();

    public void exibirBoletins(){
        if(!boletinho.isEmpty()){
            for(Map.Entry<String, Double> boletinho_aluno: boletinho.entrySet()){

                String nome_aluno = boletinho_aluno.getKey();
                double nota_aluno = boletinho_aluno.getValue();

                System.out.println("Nome: "+nome_aluno+" - Nota: "+nota_aluno);
            }
        }else{
            System.out.println("Vazio.");
        }


    }

    public void adicionarAluno(){
        String nome_aluno;
        double notaFinal;

        System.out.println("Qual o nome do aluno?");
        nome_aluno = ler.nextLine();
        System.out.println("Qual a nota final do aluno?");
        notaFinal = ler.nextDouble();
        ler.nextLine();

        boletinho.put(nome_aluno,notaFinal);
    }

    public void mudarNota(){
        if(!boletinho.isEmpty()){
            String nome_aluno;
            double nota;
            exibirBoletins();
            System.out.println("Qual o nome do aluno?");
            nome_aluno = ler.nextLine();
            System.out.println("Mudar para que nota?");
            nota = ler.nextDouble();
            ler.nextLine();
            boletinho.put(nome_aluno,nota);
            exibirBoletins();
        }else{
            System.out.println("Nao existem alunos.");
        }



    }

    public void pesquisarNota(String aluno){
        if(!boletinho.isEmpty() && boletinho.containsKey(aluno)){
            System.out.println(boletinho.get(aluno));
        }else{
            System.out.println("Boletinho vazio ou aluno inexistente.");
        }
    }

    public void conferirExistencia(String aluno){
        if(!boletinho.isEmpty() && boletinho.containsKey(aluno)){
            System.out.println("O aluno "+aluno+" está matriculado.");
        }else{
            System.out.println("Erro, aluno não encontrado.");
        }
    }

    public void removerAluno(String aluno) {
        if (!boletinho.isEmpty() && boletinho.containsKey(aluno)) {
            System.out.println("O aluno " + aluno + " foi removido.");
            boletinho.remove(aluno);
        }
    }
}
