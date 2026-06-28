//----------------------------------------------------------------------------------------
// Para uma pilha simples precisamos apenas de:
// 5 seguintes funções V
//
// 1 estarcheia()
// 2 estavazia()
// 3 imprimir()
// 4 empilhar()
// 5 desempilhar()
//
// e uma variável "quantidade".
//
// seu funcionamento é bem simples, a incrementação de elementos na pilha é apenas uma adição ou subtração da variavel quantd.
//----------------------------------------------------------------------------------------

#include <stdio.h>

#define TAMANHO_MAX 5

int pilha[TAMANHO_MAX];
int quantidade = 0;

int estacheia(){
    return quantidade == TAMANHO_MAX;
}

int estavazia(){
    return quantidade == 0;
}

void imprimir(){
    if(estavazia())
        printf("Stack is empty!\n");
    else{
        for(int i = 0; i <quantidade;i++){
            printf("%d ",pilha[i]);
        }
    }
    printf("\nFree: %d.\n\n",TAMANHO_MAX-quantidade);
}

void empilhar(int X){
    if(estacheia()){
        printf("Erro, a lista está cheia\n");
    }else{
        pilha[quantidade] = X;
        quantidade++;
    }
    imprimir();
}  

void desempilhar(){
    if(estavazia()){
        printf("Stack its empty, include itens to call function.\n");
    }else{
        quantidade--;
    }
    imprimir();
}
int main(){
    empilhar(10);
}