#include <stdio.h>
#include <locale.h>

#define LINHAS 3
#define COLUNAS 4

int main(){
    setlocale(LC_ALL, "pt_BR.UTF-8");

    int k = 3;

    int matriz_a[LINHAS][COLUNAS] = {
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1}
    };

    for(int i = 0; i < LINHAS; i++){
        for(int j = 0; j < COLUNAS; j++){
            matriz_a[i][j] = matriz_a[i][j]*=k;
        }
    }

    for(int i = 0; i < LINHAS; i++){
        printf("\n");
        for(int j = 0; j < COLUNAS; j++){
            printf("%d ",matriz_a[i][j]);
        }
    }
}