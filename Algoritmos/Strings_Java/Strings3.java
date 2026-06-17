import java.util.Scanner;
public class Strings3 {
    public static void main(String[] Args){

        Scanner leitor = new Scanner(System.in);

        //A)
        String S1;
        System.out.println("Digite uma frase/palavra:");
        S1 = leitor.nextLine();

        //B)
        System.out.printf("\nO tamanho da String: %s é de %d",S1,S1.length());

        //C)
        String S2;
        System.out.println("\nDigite outra String");
        S2 = leitor.nextLine();
        if(S1.equals(S2)){
            System.out.printf("\nA String 1: %s é igual a String 2: %s.",S1,S2);
        }else{
            System.out.println("\nAs strings não são iguais: "+S1+" "+S2+".");
        }


        //D)
        String S3 = S1+S2;
        System.out.println(S3);

        //E)
        char[] S1_inverse = S1.toCharArray();
        System.out.println("A String: "+S1+" ao inverso é: ");
        for(int i=S1_inverse.length-1; i>=0; i--){
            System.out.print(S1_inverse[i]);
        }


    }
}
