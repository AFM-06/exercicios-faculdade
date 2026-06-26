#include <stdio.h>
#include <windows.h>

int main(){
    SetConsoleOutputCP(CP_UTF8);

    int num;
    int soma = 0;

    printf("Informe um número: ");
    scanf("%d",&num);

    for (int i = 1; i <= num ; i++){
        if (num%i==0){
            soma+=1;
        }
    }

    if (soma==2){
            printf("é primo");
    }else{
        printf("n é número primo");
    }

    return 0;
}