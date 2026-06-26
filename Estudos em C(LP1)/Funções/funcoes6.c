#include <stdio.h>

int inveter(int a){
    int invertido = 0;
    while (a!=0){
        invertido = invertido * 10 + a % 10;
        a /= 10;
    }
    return invertido;
    
}

int main(){
    int b = 1234;
    printf("%d ",inveter(b));
}