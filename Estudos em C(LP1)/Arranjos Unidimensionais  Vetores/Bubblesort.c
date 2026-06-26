#include <stdio.h>
#include <locale.h>

#define TAMANHO 5
// tamanho 5 Constante, ajudar na organização.
int main (){
    setlocale(LC_ALL, "pt_BR.UTF-8");
    int vetor[TAMANHO] = {5,2,10,4,6};

    printf("Vetor antes do Bubble Sort: ");
// Printa o vetor antes do Bubble Sort.
    for (int i = 0; i < TAMANHO; i++){
        if (i == 4){
            printf("%d.",vetor[i]);
        } else {
            printf("%d, ",vetor[i]);
        }
    }
// Bubble Sort:
    for (int i = 0; i < TAMANHO - 1; i++){ // começa com i = 0, j = 0. O i servindo apenas pra repetir o for de baixo 4 vezes.
        for (int j = 0; j < TAMANHO - i - 1; j++){ // 
            if (vetor[j] > vetor[j+1]){ //J = 0: SE 5(j) > 2(j+1) : temp = 5, posição 0 = 2 , posição 1 = a 5.
                int temp = vetor[j];      //J = 1: Se 5 > 10 : FALSO
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = temp;
            }
        }
    }
// Vetor após Bubble sort:
    printf("\n");
    printf("Vetor após Bubble Sort: ");
// Apenas para organização do print.
    for (int i = 0; i < TAMANHO; i++){
        if (i == 4){
            printf("%d.",vetor[i]);
        } else {
            printf("%d, ",vetor[i]);
        }
    }

    return 0;
}