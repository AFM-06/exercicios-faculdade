#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");

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