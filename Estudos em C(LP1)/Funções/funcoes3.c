#include <stdio.h>
#include <locale.h>

int FATORIAL(int a){
    if (a<0){
        return -1;
    }else{
        int fatorial = 1;
        for (int i = 1; i <= a; i++){
            fatorial*=i;
        }
        return fatorial;
    }
}

int main(){
    setlocale(LC_ALL, "pt_BR.UTF-8");
    int num = -5;
    printf("O fatorial de %d é %d",num,FATORIAL(num));
}