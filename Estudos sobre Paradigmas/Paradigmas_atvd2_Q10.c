#include <stdio.h>
#include <windows.h>
#include <string.h>

#define TAMANHO 1

struct Candidato{
    char nome[20];
    int numero_votos;
    int numero;
};

void preencher_candidatos(struct Candidato candidatos[]){
    for(int i = 0; i < TAMANHO; i++){
        printf("Nome do candidato %d\n", i+1);
        scanf("%s",candidatos[i].nome);

        printf("Numero do %s.\n",candidatos[i].nome);
        scanf("%d",&candidatos[i].numero);

        candidatos[i].numero_votos = 0;
    }
}

void menu_votacao(struct Candidato candidatos[],int *votos_brancos){

    int numero_eleitor = -1;
    int sistema_votos_brancos;
    *votos_brancos = 0;
    while(numero_eleitor!=0){
        sistema_votos_brancos = 2;
        printf("Em qual candidato deseja votar?\n");
        for(int i = 0; i < TAMANHO; i++){
            printf("Candidato: %s   || Numero: %d.\n",candidatos[i].nome,candidatos[i].numero);}
        scanf("%d",&numero_eleitor);

        if(numero_eleitor == 0){
            break;
        }

        for(int j = 0; j < TAMANHO; j++){
            if(numero_eleitor == candidatos[j].numero){
                candidatos[j].numero_votos+=1;
                sistema_votos_brancos = 1;
            }
        }
        if(sistema_votos_brancos==2){
            (*votos_brancos)++;
        }
    }
}

void apuracao(struct Candidato candidatos[]){

    int vencedor = 0;
    vencedor = candidatos[0].numero_votos;
    char vencedor_nome[20];
    strcpy(vencedor_nome,candidatos[0].nome);

    for(int i = 1; i < TAMANHO; i++){
        if(candidatos[i].numero_votos>vencedor){
            vencedor = candidatos[i].numero_votos;
            strcpy(vencedor_nome,candidatos[i].nome);
        }
    }
    printf("O vencedor foi o candidato: %s com %d votos.\n",vencedor_nome,vencedor);
}

void exibir_resultado(struct Candidato candidatos[],int votos_brancos){
    int total_votos = 0;
    for(int i = 0; i < TAMANHO; i++){
        total_votos+=candidatos[i].numero_votos;
    }
    printf("Total de votos: %d.\n",total_votos+votos_brancos);
    printf("Votos brancos: %d\n",votos_brancos);
    for(int i = 0; i < TAMANHO; i++){
        printf("Candidato: %s   || Numero: %d  || Numero de votos: %d.\n",candidatos[i].nome,candidatos[i].numero,candidatos[i].numero_votos);
    }
    apuracao(candidatos);
}


int main(){
    SetConsoleOutputCP(CP_UTF8);

    struct Candidato candidatos[TAMANHO];
    int votos_brancos = 0;

    preencher_candidatos(candidatos);
    menu_votacao(candidatos,&votos_brancos);
    exibir_resultado(candidatos,votos_brancos);
    return 0;
    
}