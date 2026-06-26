//Faça aqui a questão 02 do exercício 05 (manhã)
#include <stdio.h>
#define CONTATOS 3
#define MAX 25

struct Telefone{
    int ddd;
    int num;
};

struct Contato{
    char nome[MAX];
    char last_name[MAX];
    struct Telefone telefone;
};


int main(){
    struct Contato contatos[CONTATOS];
    for (int i = 0; i < CONTATOS; i++){
        
        printf("Entre com os dados do contato %d\n",i+1);

        printf("Nome: ");
        scanf("%s",contatos[i].nome);

        printf("Ultimo nome: ");
        scanf("%s",contatos[i].last_name);

        printf("DDD: ");
        scanf("%d",&contatos[i].telefone.ddd);

        printf("Numero: ");
        scanf("%d",&contatos[i].telefone.num);
    }

    printf("\nCONTATOS: \n\n");

    for (int i = 0; i < CONTATOS; i++){
        printf("Contato %d\n",i+1);

        printf("Nome: %s.\n",contatos[i].nome);
        printf("Ultimo nome: %s.\n",contatos[i].last_name);
        printf("DDD: %d.\n",contatos[i].telefone.ddd);
        printf("Numero: %d.\n\n",contatos[i].telefone.num);
    }

    return 0;
}
