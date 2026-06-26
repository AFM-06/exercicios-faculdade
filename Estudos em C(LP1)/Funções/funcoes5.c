#include <stdio.h>

int somar(int a){
    int somador = 0;
    while (a != 0){
        somador+= a % 10;
        a /= 10;
    }
    return somador;
}
int main(){
    int num = 54;
    printf("%d",somar(num));
}