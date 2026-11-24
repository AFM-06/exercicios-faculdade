package Questao_2;

public class Boletim {
    public static final double FREQUENCIA_MINIMA = 75;
    public static final int MEDIA_MINIMA = 7;
    public static final int NUMERO_DE_NOTAS = 2;
    public static final int SEM_AULAS = 0;
    public static final double CEM_PORCENTO = 100.0;

    public String situacao(double nota1 , double nota2 , int presenca, int totalDeAulas) {
        if(totalDeAulas <= SEM_AULAS) {return " Sem aulas";}

        double media = (nota1+nota2)/NUMERO_DE_NOTAS;
        double frequencia = presenca * CEM_PORCENTO / totalDeAulas;

        if(media >= MEDIA_MINIMA && frequencia >= FREQUENCIA_MINIMA){
            return "Aprovado";
        }
        return "Reprovado";
    }


    private String formatarSituacao(double nota1, double nota2, int presencas, int totalAulas) {
        return "Situacao: " + situacao(nota1, nota2, presencas, totalAulas);
    }

    public String tela (double nota1 , double nota2 , int presenca, int totalDeAulas) {
         return formatarSituacao( nota1 ,  nota2 ,  presenca,  totalDeAulas) ;
    }

    public String arquivo (double nota1 , double nota2 , int presenca, int totalDeAulas) {
        return formatarSituacao( nota1 ,  nota2 ,  presenca,  totalDeAulas) ;
    }
}