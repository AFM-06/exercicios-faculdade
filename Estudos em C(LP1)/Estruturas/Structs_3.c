#include <stdio.h> 
#define TAMANHO 5 
#define MAX 30 

struct Data{ 
    int dia; 
    int mes; 
    int ano; 
}; 

struct Pessoa{ 
    char nome [MAX]; 
    struct Data nascimento; 
}; 

struct Carro{ 
    char marca [MAX]; 
    char modelo [MAX]; 
    int ano; 
    struct Pessoa proprietario; 
};

int main() { 
    struct Carro carros [TAMANHO]; 
    for (int i=0;i<TAMANHO; i++){ 
        printf("Entre com as informações do carro %d\n", i+1); 
        printf("Marca: "); 
        scanf("%29s", &carros[i].marca); 
        printf("Modelo: "); 
        scanf("%29s", &carros[i].modelo); 
        printf("Ano: "); 
        scanf("%d",&carros[i].ano); 
        printf("Entre com as informações do proprietário do carro %d\n",i+1); 
        printf("Nome: "); 
        scanf("%29s", &carros[i].proprietario.nome); 
        printf("Data de Nascimento (dia mes ano): "); 
        scanf("%d %d %d", &carros[i].proprietario.nascimento.dia, 
        &carros[i].proprietario.nascimento.mes, 
        &carros[i].proprietario.nascimento.ano); 
    }

    printf("\nCARROS E PROPRIETARIOS\n"); 
    for (int i=0;i<TAMANHO; i++){
        printf("Veículo %d\n", i+1); 
        printf("Marca/modelo: %s/%s -ano: %d\n",
        carros[i].marca,
        carros[i].modelo,
        carros[i].ano); 

        printf("Proprietário: %s (nascido em %02d/%02d/%d)\n\n",
        carros[i].proprietario.nome, 
        carros[i].proprietario.nascimento.dia,
        carros[i].proprietario.nascimento.mes,
        carros[i].proprietario.nascimento.ano); 
    } 
}