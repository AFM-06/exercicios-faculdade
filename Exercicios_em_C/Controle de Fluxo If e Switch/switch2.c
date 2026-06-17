#include <stdio.h>
#include <locale.h>

int main(){
    int idade;
    setlocale(LC_ALL, "pt_BR.UTF-8");
    printf("Quantos anos você tem?\n");
    scanf("%d",&idade);
    if (idade>= 18 && idade<=70){
        printf("Para %d anos de idade o voto é obrigatório.",idade);
    }else if ((idade == 16) || (idade == 17) || (idade>70)){
        printf("Para %d anos de idade o voto é facultativo.",idade);
    }else{
        printf("Menores de 16 anos não podem votar.");
    }
    return 0;
}