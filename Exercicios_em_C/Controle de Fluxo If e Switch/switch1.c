#include <stdio.h>
#include <locale.h>
#define INGRESSO 50.0

int main(){
    setlocale(LC_ALL, "pt_BR.UTF-8");
    int idade_visitante;
    printf("Qual sua idade? ");
    scanf("%d",&idade_visitante);
    if (idade_visitante>=60){
        printf("O valor que o senhor pagará no INGRESSO será de R$ %.2f , com 15%% de desconto.",INGRESSO-(INGRESSO*0.15));
    }else if (idade_visitante>=18 && idade_visitante<=59){
        printf("O valor que o senhor pagará no INGRESSO será de R$ %.2f , sem desconto.",INGRESSO);
    }else{
        printf("O valor do seu INGRESSO é de R$ %.2f , com 10%% de desconto.", INGRESSO-(INGRESSO*0.10));
    }
    return 0;
}