#include <stdio.h>
#include <locale.h>

#define LINHAS 7
#define COLUNAS 7

int main(){
    setlocale(LC_ALL, "pt_BR.UTF-8");

    int matriz[LINHAS][COLUNAS];

    for(int i = 0; i < LINHAS; i++){
        for(int j = 0; j < COLUNAS; j++){
            if (i == j)
                matriz[i][j] = 1;
             else 
                matriz[i][j] = 0;
            }
        }
    
    for (int i = 0; i < LINHAS; i++){
        printf("\n");
        for (int j = 0; j < COLUNAS; j++){
            printf("%d ",matriz[i][j]);
        }
    }

    return 0;
}