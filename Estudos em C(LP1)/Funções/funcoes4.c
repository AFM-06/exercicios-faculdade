#include <stdio.h>
#include <locale.h>
//contador digito
int contar_num(int a){
    if (a == 0){
        return 1;
    }
    int contador = 0;
    while (a != 0){
        a /= 10;
        contador++;
    }
    return contador;
    
}

int main(){
    int a = 52;
    printf("%d",contar_num(a));

}