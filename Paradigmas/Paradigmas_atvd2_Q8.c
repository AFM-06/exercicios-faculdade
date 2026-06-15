#include <stdio.h>
#include <windows.h>
#include <string.h>

#define TAMANHO 2
struct Produto{
    char nome[20];
    float preco;
    int estoque;
    float preco_em_estoque;
};

void preco_estoque(struct Produto produtos[]){
    for(int i = 0; i < TAMANHO; i++){
        produtos[i].preco_em_estoque = produtos[i].estoque * produtos[i].preco;
    }
}

void cadastrar_produtos(struct Produto produtos[]){

    for(int i = 0; i < TAMANHO; i++){
        printf("Qual o nome do produto %d?\n", i + 1);
        scanf("%s",produtos[i].nome);
        printf("Qual o preço do produto %s?\n", produtos[i].nome);
        scanf("%f", &produtos[i].preco);
        printf("Qual a quantidade do produto %d no estoque?\n", i + 1);
        scanf("%d", &produtos[i].estoque);
    }
    preco_estoque(produtos);
}

void exibir_relatorio(struct Produto produtos[]){
    for(int i = 0; i < TAMANHO; i++){
        printf("\n");
        printf("==========Produto %d=========\n",i+1);
        printf("Nome: %s.\n",produtos[i].nome);
        printf("Preço: R$ %.2f.\n",produtos[i].preco);
        printf("Quantidade em estoque: %d.\n",produtos[i].estoque);
        printf("Preço total em estoque: R$ %.2f.\n",produtos[i].preco_em_estoque);
        printf("=============================\n");
    }
}

void produto_mais_caro(struct Produto produtos[]){
    char nome_mais_caro[50];
    strcpy(nome_mais_caro, produtos[0].nome);
    float preco_mais_caro = produtos[0].preco;
    for(int i = 1; i < TAMANHO; i++){
        if(produtos[i].preco>preco_mais_caro){
            preco_mais_caro = produtos[i].preco;
            strcpy(nome_mais_caro, produtos[i].nome);
        }
    }
    printf("O produto mais caro é o %s com o preço de R$ %.2f",nome_mais_caro,preco_mais_caro);
}

int main(){
    SetConsoleOutputCP(CP_UTF8);

    struct Produto produtos[TAMANHO];

    cadastrar_produtos(produtos);

    exibir_relatorio(produtos);

    produto_mais_caro(produtos);

    return 0;
}