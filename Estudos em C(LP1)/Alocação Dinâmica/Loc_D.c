#include <stdio.h>
#include <stdlib.h>

int main(){
    int *array = (int*) malloc(1 * sizeof(int));
    if (array == NULL){
        printf("Erro alocação de memória");
        return 1;
    }
        
    int menu = 1;
    int i = 0;
    while (1){
        printf("Digite mais um valor ou termine o programa [0] -> ");
        scanf("%d",&menu);
        if (menu == 0){
            break;
        }

        array = realloc(array,(1 + i) * sizeof(int));
        if (array == NULL){
            printf("Erro alocação de memória");
            return 1;
        }

        array[i] = menu;
        i++;
    }

    for(int j = 0; j < i; j++){
        printf("Valor [%d] -> %d\n",j,array[j]);
    }

    free(array);
    return 0;
}