#include <stdio.h>
#include <locale.h>

int main(){
    
    setlocale(LC_ALL, "pt_BR.UTF-8");

    int vetor[5] = {6,2,8,1,10};
    int i = 0;
    int achou = 0;
    int valor = 10;

    while (i<5 && !achou){
        if (vetor[i] == valor){
            achou = 1;
        } else {
            i++;
        }
    }

    if (achou){
        printf("O valor %d está na posição %d do vetor.",valor,i);
    } else{
        printf("O valor %d não foi achado no vetor.",valor);
    }

    return 0;
}