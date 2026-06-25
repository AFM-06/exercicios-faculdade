#include <stdio.h>
#include <locale.h>

#define LINHAS 4
#define COLUNAS 4

int main(){
    setlocale(LC_ALL, "pt_BR.UTF-8");

    int matriz_a[LINHAS][COLUNAS] = {
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1}    
    };
    int matriz_b[LINHAS][COLUNAS] = {
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1}
    };
    int matriz_resultado[LINHAS][COLUNAS];

    for(int i = 0; i < LINHAS; i++){
        for(int j = 0; j < COLUNAS; j++){
            matriz_resultado[i][j] = matriz_a[i][j] + matriz_b[i][j];
        }
    }

    for(int i = 0; i < LINHAS; i++){
        printf("\n");
        for(int j = 0; j < COLUNAS; j++){
            printf("%d ",matriz_resultado[i][j]);
        }
    }
    
}