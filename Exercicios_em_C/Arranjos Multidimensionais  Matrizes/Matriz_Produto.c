#include <stdio.h>
#include <locale.h>

#define LINHAS_A 3
#define COLUNAS_A 4

#define LINHAS_B 4
#define COLUNAS_B 3
// MUTIPLICAÇÃO DE MATRIZES: COLUNAS A = LINHAS B, MATRIZ C = LINHAS A, COLUNAS B
int main(){
    int matriz_a[LINHAS_A][COLUNAS_A] = { 
        {1, 1, 1, 1}, 
        {1, 1, 1, 1}, 
        {1, 1, 1, 1}
    };

    int matriz_b[LINHAS_B][COLUNAS_B] = {
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1}
    };

    int matriz_c[LINHAS_A][COLUNAS_B] = {0};

    for (int i = 0; i < LINHAS_A; i++){
        for (int j = 0; j <COLUNAS_B; j++){
            for (int k = 0; k < LINHAS_B; k++){
                matriz_c[i][j] += matriz_a[i][k] * matriz_b[k][j];
            }

        }

    }
    
    for(int i = 0; i < LINHAS_A; i++){
        printf("\n");
        for (int j = 0; j < COLUNAS_B; j++){
            printf("%d ",matriz_c[i][j]);
        }
    }

    return 0;

}