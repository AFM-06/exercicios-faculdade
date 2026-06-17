import java.util.Scanner;

public class Strings4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        String usuario;
        System.out.println("Informe uma String:");
        usuario = leitor.nextLine();

        System.out.printf("\nA String %s contem %d caracteres.",usuario,usuario.length());

        System.out.println("A String em maíusculo: "+usuario.toUpperCase());

        System.out.println("A String em minúsculo: "+usuario.toLowerCase());

        char[] usuario_c = usuario.toLowerCase().toCharArray();
        int contador_vogal = 0;
        for(int i = usuario_c.length-1;i>=0;i--){
            if(usuario_c[i] =='a'|| 
                usuario_c[i] =='e'|| 
                usuario_c[i] =='i'|| 
                usuario_c[i] =='o'|| 
                usuario_c[i] =='u'){
                contador_vogal++;
            }
        }
            
        if(contador_vogal>0){
            System.out.println("A String tem "+contador_vogal+" vogais.");
        }else{
            System.out.println("A String não tem vógais.");
        }

        if(usuario_c.length>=2){
            if(usuario_c[0] == 'u' && usuario_c[1] == 'e'){
                System.out.println("A String começa sim com \"UE\" ");
            }else{
                System.out.println("A String não começa com \"UE\" ");
            }
        }else{
            System.out.println("A String não possui mais do que 1 caracter.");
        }

        char[] usuario_c_inverse = usuario.toCharArray();
        for(int j = usuario_c_inverse.length-1;j>=0;j--){
            System.out.print(usuario_c_inverse[j]);
        }
        }
    }
