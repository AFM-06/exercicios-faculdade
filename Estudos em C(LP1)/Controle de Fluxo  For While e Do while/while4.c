#include <stdio.h>
#include <windows.h>

int main(){

    SetConsoleOutputCP(CP_UTF8);

    int opcao;

    do{
        printf("________________________________________________________________________\n");
        printf("INFORME PARA QUAL LINGUA VOCE DESEJA TRADUZIR A FRASE \"EU TE AMO\" \n");
        printf("[1] INGLES\n");
        printf("[2] FRANCÊS\n");
        printf("[3] ALEMÃO\n");
        printf("[4] ITALIANO\n");
        printf("[5] SAIR\n");
        printf("_________________________________________________________________________\n");
        scanf("%d",&opcao);

        switch (opcao){
        case 1:
            printf("I love you.\n");
            break;
        
        case 2:
            printf("Je vous aime.\n");
            break;

        case 3:
            printf("Ich liebe dich.\n");
            break;

        case 4:
            printf("ti amo.\n");
            break;
        
        case 5:
            printf("Saindo do programa.\n");
            break;
        
        default:
            printf("Essa opção não existe ou está indisponível.\n");
            break;
        }
    } while (opcao != 5);

    return 0;
    
}