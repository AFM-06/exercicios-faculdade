#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "pt_BR.UTF-8");
    float num1,num2;
    char operador;

    printf("Informe o operador:\n[+]\n[-]\n[/]\n[*]\n ");
    scanf("%c",&operador);
    printf("Informe o primeiro e o segundo número:\n");
    scanf("%f%f",&num1,&num2);

    switch (operador){
        case '+':
            printf("%2.f",num1+num2);
            break;
        case '-':
        printf("%2.f",num1-num2);
            break;
        case '/':
            if(num2 != 0){
                printf("%2.f",num1/num2);
            }else{
                printf("Erro, divisão por zero.");
            }
            break;
        case '*':
            printf("%2.f",num1*num2);
            break;
        default:
            printf("Operador inválido ou desconhecido.");
    }
    return 0;
}