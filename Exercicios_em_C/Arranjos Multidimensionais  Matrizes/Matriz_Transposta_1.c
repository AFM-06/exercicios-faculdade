#include <stdio.h>
#include <locale.h>

#define LINHAS_A 2
#define COLUNAS_A 3

// MATRIZ TRANSPOSTA
int main (){
    setlocale(LC_ALL, "pt_BR.UTF-8");

    int matriz[LINHAS_A][COLUNAS_A];
    int matriz_transposta[COLUNAS_A][LINHAS_A] = {0};
    int k = 5;

    for(int i = 0; i < LINHAS_A; i++){
        for (int j = 0; j < COLUNAS_A; j++){
            printf("Valor para o elemento %dx%d da matriz: ",i,j);
            scanf("%d",&matriz[i][j]);
        }
    }

    printf("\n");
    for(int i = 0; i < COLUNAS_A; i++){
        for(int j = 0; j < LINHAS_A; j++){
            matriz_transposta[i][j] = matriz[j][i] * k;
        }
    }
    // LEMBRAR QUE O NUMERO DE COLUNAS E LINHAS INVERTEU, E NO PRINT TAMBÉM PRECISA SER ASSIM
    for(int i = 0; i < COLUNAS_A; i++){
        printf("\n");
        for (int j = 0; j < LINHAS_A; j++){
            printf("%d ",matriz_transposta[i][j]);
        }   
    }
    return 0;

}