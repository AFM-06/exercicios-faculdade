#include <stdio.h>
#include <math.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "pt_BR.UTF-8");

    int num;
    int Ehprimo = 1;

    printf("Digite um número: ");
    scanf("%d",&num);

    if (num <= 1){
        Ehprimo = 0;
    } else {
        for (int i = 2; i <= sqrt(num) ; i++){
            if (num  % i == 0){
                Ehprimo = 0;
                break;
            }
        }
    }

    if (Ehprimo)
        printf("O número %d é primo.",num);
    else
        printf("O número %d não é primo.",num);
}