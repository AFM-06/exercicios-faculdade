//----------------------------------------------------------------------------------------
//Para implementação de Filas com estruturas é necessário 5 funções: 
//
// estavazia()
// estacheia()
// imprimir()
// enfileirar()
// desenfileirar()
//
// ---------------------------------------------------------------------------------------
//
//Duas estruturas:
// |
// ├── Pessoa -> Nome e Senha.
// ├── Descritor -> Variável do tipo Struct "Pessoa dados", e uma variável inteira chamada "fim"
// |                                 |
// |                                 └── dados[0] → nome: "Ana"   senha: 1
// |
// ├── Uma variável do tipo Struct "Fila"
// |                                 ├── fila
// └E uma variavel tipo Struct       ├── dados[0] → nome: "Ana"   senha: 1
//  chamada vazio, apenas para       ├── dados[1] → nome: "Bruno" senha: 2
//  zerar os valores na hora de      ├── dados[2] → vazio
//  andar a fila (desenfileirar)     ├── dados[3] → vazio
//                                   ├── dados[4] → vazio
//                                   └── fim = 2
//
//
//
//
//
//
//
//
//
//----------------------------------------------------------------------------------------
#include <stdio.h>

#define TAMANHO_MAX 5
#define STRING_MAX 50

struct Pessoa{
    char nome[STRING_MAX];
    int senha;
};

struct Descritor{
    struct Pessoa dados[TAMANHO_MAX];
    int fim;
};

struct Descritor fila;
struct Pessoa vazio;

int estavazia(){
    return fila.fim == 0; // Se o fim da fila for no indice 0, logo ela está vazia e essa função retorna o valor 1 (True)
}

int estacheia(){
    return fila.fim == TAMANHO_MAX; // Mesma lógica, se estiver cheia retorne 1 (True)
}

void imprimir(){
    if (estavazia()){
        printf("Queue its empty.\n"); 
    }else{
        printf("\nData:\n");
        for(int i = 0; i < fila.fim; i++){
            printf("%s -> %d\n",fila.dados[i].nome, fila.dados[i].senha); // na hora de acessar os elementos fila.dados[0] → nome: "Ana"   senha: 1
        }
    }
    printf("Free: %d",TAMANHO_MAX-fila.fim); // Mostrar o espaço livre ainda quantidade máxima - final da fila
}

void enfileirar(){
    if(estacheia()){
        printf("\nQueue's full!");
    }else{
        printf("Nome:");
        scanf("%49s",&fila.dados[fila.fim].nome); // Nome adicionado no fim da fila (dados[fila.fim])
        printf("Senha:");
        scanf("%d",&fila.dados[fila.fim].senha);
        fila.fim++;
    }
}

void desenfileirar(){
    if(estavazia()){
        printf("\nQueue its empty.");
    }else{
        for(int i = 0; i<fila.fim;i++){
            fila.dados[0] = fila.dados[0+1]; // Aqui a fila "anda", quem tava em quarto vai pra terceiro, terceiro pra segundo...
        }
        fila.fim--;
        fila.dados[fila.fim] = vazio; // e o fim da fila é igual a Vazio, é uma variavel igual a fila, só que com valores iguais a zero.
    }
}

int main(){
    fila.fim = 0;
    enfileirar();
    enfileirar();
    imprimir();
}