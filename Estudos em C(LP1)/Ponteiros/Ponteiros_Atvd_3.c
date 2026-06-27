#include <stdio.h>

int main(){
    int array[10];
    for (int i = 0; i<10;i++){
        *(array+i) = i + 1;
    }
    printf("\nVetor:\n");
    for(int i = 0; i < 10; i++){
        printf("%d ",array[i]);
    }
    printf("\n");
}