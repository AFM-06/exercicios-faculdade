#include <stdio.h>
#include <locale.h>

int main (){
    setlocale(LC_ALL, "pt_BR.UTF-8");

    int num;
    int Ehprimo = 1;
    int i;
    printf("Entre com um número: ");
    scanf("%d",&num);
    if (num<=1){
        Ehprimo = 0;
    } else{
        for ( i = 2; i < num; i++){
            if (num % i == 0){
                Ehprimo = 0;
                break;
            }
        }
    }

    if (Ehprimo){
        printf("O número %d é primo.",num);
    } else{
        printf("O número %d não é primo",num);
    }
    return 0;
}