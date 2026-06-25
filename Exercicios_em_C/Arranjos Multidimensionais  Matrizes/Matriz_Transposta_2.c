#include <stdio.h>
#include <locale.h>

#define LINHAS_A 2
#define COLUNAS_A 3

int main(){
    setlocale(LC_ALL, "pt_BR.UTF-8");

    int matriz_a[LINHAS_A][COLUNAS_A] = {
        {1,2,3},
        {4,5,6}
    };
    int matriz_resultante[COLUNAS_A][LINHAS_A] = {0};
    int k = 5;

    for (int i = 0; i < LINHAS_A; i++){
        for (int j = 0; j < COLUNAS_A; j++){
            matriz_resultante[j][i] = matriz_a[i][j] * k;
        }
    }
    for (int i = 0; i < COLUNAS_A; i++){
        printf("\n");
        for (int j = 0; j < LINHAS_A; j++){
            printf("%d ",matriz_resultante[i][j]);
        }
    }

}