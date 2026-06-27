#include <stdio.h>

int main(){
    int array[7] = {10,20,30,40,50,60,70};
    int *p = array;

    for (int i = 0; i<7;i++){
        printf("Valor [%d] -> %d | %p\n",i,*(p+i),(p+i));
    }
}
