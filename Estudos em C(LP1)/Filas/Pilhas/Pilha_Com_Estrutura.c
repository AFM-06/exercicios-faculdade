#include <stdio.h>
#define TAMANHO_MAX_VETOR 10
#define TAMANHO_MAX_LIVROS 20
//criar variaveis, criar funcoes.
// nao precisa de inicio, só fim.
// criar as estruturas.
struct Livros{
    char nome_livro[TAMANHO_MAX_LIVROS];
    char nome_autor[TAMANHO_MAX_LIVROS];
};

struct Descritor{
    struct Livros dados[TAMANHO_MAX_VETOR];
    int fim;
};

struct Descritor pilha;
struct Livros vazio;

int estavazia(){
    return pilha.fim == 0;
}

int estacheia(){
    return pilha.fim == TAMANHO_MAX_VETOR;
}

void imprimir(){
    if(estavazia()){
        printf("Stack's empty!\n");
    }else{
        for(int i=pilha.fim-1; i >= 0; i--){ //O fim sempre é o espaço livre, então a ultima posição de dados é fila.fim-1
            printf("Position: %d Book: %s | author: %s\n",i,pilha.dados[i].nome_livro,pilha.dados[i].nome_autor);
        }
    }
}

void empilhar(){
    if(estacheia()){
        printf("Stack's full!\n");
    }else{
        printf("Autor do livro: ");
        scanf("%19s",&pilha.dados[pilha.fim].nome_autor);
        printf("Nome do livro: ");
        scanf("%19s",&pilha.dados[pilha.fim].nome_livro);
        pilha.fim++;
    }
}

void desempilhar(){
    if (estavazia()){
        printf("Stacks' empty!\n");
    }else{
        pilha.dados[pilha.fim] = vazio;
        pilha.fim--;
    }
}

int main(){
    empilhar();
    empilhar();
    imprimir();
}