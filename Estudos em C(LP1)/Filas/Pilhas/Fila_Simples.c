//----------------------------------------------------------------------------------------
//Para fazer uma fila simples é necessário 5 funções básicas:
//
// int Estacheia()
// int Estavazia()
// void Imprimir()
// void Enfileirar()
// void Desenfileirar()
//
//Também contamos com 3 variáveis de inteiros:
//
// fim = 0
// inicio = 0
// quantidade = 0
//
//O seu funcionamento consiste em:
//
//Adicionar um item no FIM -> FIM++,QUANTIDADE++
//Remover um item alterando o inicio da fila -> INICIO++, QUANTIDADE--
//
//----------------------------------------------------------------------------------------
#include <stdio.h>
#define TAMANHO_MAX 5

int fila[TAMANHO_MAX];
int fim = 0;
int inicio = 0;
int quantidade = 0;

int estacheia(){
    return quantidade == TAMANHO_MAX;
}

int estavazia(){
    return quantidade == 0;
}

void imprimir(){
    if(estacheia()){

        printf("\nFree: %d\n",TAMANHO_MAX-quantidade);

        for (int i = inicio; i<TAMANHO_MAX; i++){
            printf("%d ",fila[i]);
        }

        printf(" ->  Maximum capacity reached!\n");

    }else if(estavazia()){
        printf("Its empty.");

    }
    else{
        printf("\nFree: %d\n",TAMANHO_MAX-quantidade); // dizer quanto tem de espaço livre ainda e depois printar.
        for (int i = inicio; i<fim; i++){ // imprimir do inicio ao fim
            printf("%d ",fila[i]);
            
        }
    }
    printf("\n");
}

void enfileirar(int X){ // aqui ta correto, adicionando um item ao fim da fila, depois encrementando no fim, e na quantidade
    if (estacheia()){
        printf("Its full, error!! \n");
    }else{
        fila[fim++] = X;
        quantidade++;
    }
    imprimir();
}

void desenfileirar(){
    if(estavazia()){
        printf("\nIts empty.");
    }else{
        inicio++;
        quantidade--;
    }
    imprimir();
}

int main(){
    enfileirar(10);
    enfileirar(10);
    enfileirar(10);
    enfileirar(10);
    enfileirar(10);
    return 0;
}