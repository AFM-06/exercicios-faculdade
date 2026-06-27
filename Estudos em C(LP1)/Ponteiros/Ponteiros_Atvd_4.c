#include <stdio.h>
#include <stdlib.h>

int main(){
    int tamanho;
    printf("Qual o tamanho do vetor -> ");
    scanf("%d",&tamanho);
    int *array = (int*) malloc(tamanho * sizeof(int));

    if(*array == NULL){
        printf("Erro, alocação de memória.\n");
        return 1;
    }
    
    for(int i = 0; i < tamanho; i++){
        if(i == 0){
            *(array+i) = i+10;
        }else{
            *(array+i) = i * 10 + 10;
        }
    }

    for(int i = 0; i <tamanho ; i++){
        printf("%d ",array[i]);
    }

    free(array);

    return 0;
}