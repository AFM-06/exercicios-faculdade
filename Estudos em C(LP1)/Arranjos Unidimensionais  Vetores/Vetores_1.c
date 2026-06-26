#include <stdio.h>

int main(){

    int maior;
    int menor;
    int vetor[10];

    for (int i = 0; i<10; i++ ){
        printf("Informe o valor %d do vetor: ",i+1);
        scanf("%d",&vetor[i]);
    }
    maior = menor = vetor[0];

    for (int i = 0; i<10; i++){
        if (vetor[i]>maior){
            maior = vetor[i];
        }
        if (vetor[i]< menor){
            menor = vetor[i];
        }
    }

    printf("\nO maior numero foi %d.\n",maior);
    printf("O menor numero foi %d.",menor);
    
    return 0;
}