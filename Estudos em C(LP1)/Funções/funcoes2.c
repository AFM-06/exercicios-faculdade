#include <stdio.h>
#include <locale.h>
#include <math.h>

int PRIMO(int num){
    if (num <=1){
        return 0;
    } else{
        for (int i = 2; i <= sqrt(num); i++){
            if (num % i == 0){
                return 0;
            }
        }
    }
    return 1;
}

int main(){
    setlocale(LC_ALL, "pt_BR.UTF-8");
    int a = 4;
    if (PRIMO(a)){
        printf("O número é primo");
    } else{
        printf("O número não é primo");
    }
    return 0 ;
}