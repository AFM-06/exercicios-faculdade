import java.util.Scanner;
public class Strings2 {
    public static void main(String[] Args){
        String nome = "Matheus";
        String apelido = "matheus";

        System.out.println("\nMetodo Equals.");

        if(nome.equals(apelido)){
            System.out.println("São exatamente iguais.");
        }else{
            System.out.println("Os nomes "+nome+" e "+apelido+" não são iguais.\n");
        }

        String nome1 = "Carlos";
        String apelido1 = "carlos";

        System.out.println("Metodo equalsIgnoreCase(argumento)");

        if(nome1.equalsIgnoreCase(apelido1)){
            System.out.println("Os nomes "+nome1+" e "+apelido1+" são iguais.\n");
        }else{
            System.out.println("Os nomes não são iguais");
        }
        String nome2 = "carlosalberto";
        String apelido2 = "Pedro";

        
        System.out.println("nome2.compareTo(apelido2) = "+nome2.compareTo(apelido2));
        System.out.println("apelido2.compareTo(nome2) = "+apelido2.compareTo(nome2)+"\n");

        System.out.printf("O tamanho da string \"%s\" é: %d \n",nome1,nome1.length());
        System.out.println("O primeiro caractere do nome "+nome1+" é "+nome1.charAt(5));

        System.out.printf("\nO nome de %s em maiusculo é %s",nome1,nome1.toUpperCase());
        System.out.printf("\nO nome de %s em minusculo é %s",nome1,nome1.toLowerCase());
        Scanner ler = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra:");
        palavra = ler.nextLine();

        char[] palavra1 = palavra.toCharArray();

        for(int i=palavra1.length-1;i>=0;i--){
            System.out.print(palavra1[i]);
        }


    }
}
