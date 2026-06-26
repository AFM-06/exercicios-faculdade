#include <stdio.h>
#include <windows.h>

int main(){
    SetConsoleOutputCP(CP_UTF8);
    int soma = 1;
    unsigned int fatorial;
    printf("Informe um número para saber seu fatorial: ");
    scanf("%d",&fatorial);
    if (fatorial<0){
        printf("Não existe fatorial para número negativo");
    }else{
        for (int i = 1; i <= fatorial; i++){
            soma*=i;
        }
        printf("O fatorial de %d é %d.",fatorial,soma);
    }
    return 0;
}