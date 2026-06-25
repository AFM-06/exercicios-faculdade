#include <stdio.h>
#include <locale.h>

#define LINHAS 3
#define COLUNAS 4

int main()
{

    setlocale(LC_ALL, "pt_BR.UTF-8");
    int matriz[3][4];

    // FAZENDO A MATRIZ NULA (COMPOSTA APENAS POR ZEROS).
    for (int i = 0; i < LINHAS; i++)
    {
        for (int j = 0; j < COLUNAS; j++)
        {
            matriz[i][j] = 0;
        }
    }
    
    // IMPRIMINDO A MATRIZ.
    for (int i = 0; i < LINHAS; i++)
    {
        printf("\n");
        for (int j = 0; j < COLUNAS; j++)
        {
            printf("%d ", matriz[i][j]);
        }
    }

    return 0;
}