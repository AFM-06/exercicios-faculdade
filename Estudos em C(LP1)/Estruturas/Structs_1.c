#include <stdio.h>
#include <locale.h>
#include <string.h>

#define NUM 1
#define MAX 30

struct Par {
    char par[MAX];
    char par_dois[MAX];
};

struct Nomes {
    char extenso[MAX];
    char extenso_dois[MAX];
    struct Par pares;
};

struct Numero {
    int numero;
    int numero_dois;
    struct Nomes nomes;
};

int main() {
    setlocale(LC_ALL, "pt_BR.UTF-8");
    struct Numero numeros[NUM];

    for (int i = 0; i < NUM; i++) {
        printf("Digite o número 1: ");
        scanf("%d", &numeros[i].numero);
        getchar(); 

        printf("Digite o nome do número 1: ");
        fgets(numeros[i].nomes.extenso, sizeof(numeros[i].nomes.extenso), stdin);
        numeros[i].nomes.extenso[strcspn(numeros[i].nomes.extenso, "\n")] = 0;

        printf("O número é par: ");
        fgets(numeros[i].nomes.pares.par, sizeof(numeros[i].nomes.pares.par), stdin);
        numeros[i].nomes.pares.par[strcspn(numeros[i].nomes.pares.par, "\n")] = 0;

        printf("Digite o número 2: ");
        scanf("%d", &numeros[i].numero_dois);
        getchar();

        printf("Digite o nome do número 2: ");
        fgets(numeros[i].nomes.extenso_dois, sizeof(numeros[i].nomes.extenso_dois), stdin);
        numeros[i].nomes.extenso_dois[strcspn(numeros[i].nomes.extenso_dois, "\n")] = 0;

        printf("O número é par: ");
        fgets(numeros[i].nomes.pares.par_dois, sizeof(numeros[i].nomes.pares.par_dois), stdin);
        numeros[i].nomes.pares.par_dois[strcspn(numeros[i].nomes.pares.par_dois, "\n")] = 0;
    }

    for (int i = 0; i < NUM; i++) {
        printf("O número %d da rodada %d foi: %d, e se escreve %s (é par: %s)\n",
            i + 1,
            i + 1,
            numeros[i].numero,
            numeros[i].nomes.extenso,
            numeros[i].nomes.pares.par);

        printf("O número %d da rodada %d foi: %d, e se escreve %s (é par: %s)\n",
            i + 2,
            i + 1,
            numeros[i].numero_dois,
            numeros[i].nomes.extenso_dois,
            numeros[i].nomes.pares.par_dois);
    }

    return 0;
}