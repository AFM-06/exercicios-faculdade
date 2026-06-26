#include <stdio.h>
#include <locale.h>
#define TAMANHO 8
int main(){
    setlocale(LC_ALL, "pt_BR.UTF-8");

    int vetor[TAMANHO];
    float media;
    int acima_da_media;

    for (int i = 0; i < TAMANHO; i++){
        printf("Valor para a posição %d do vetor: \n",i);
        scanf("%d",&vetor[i]);
        media+=vetor[i];
    }

    media = media / TAMANHO;

    for (int i = 0; i < TAMANHO; i++){
        if (vetor[i] > media){
            acima_da_media++;
        }
    }

    if (acima_da_media){
        printf("A média do vetor é de %.2f e existem %d valores acima da média.\n",media,acima_da_media);
    } else{
        printf("A média do vetor é de %.2f e não existem valores acima da média pois todos são iguais.",media);
    }

    return 0;
}