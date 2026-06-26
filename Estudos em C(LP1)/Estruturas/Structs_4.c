#include <stdio.h>
#include <locale.h>
#define MAX 30
#define NUM 2

struct Data{
    int dia;
    int mes;
    int ano;                                        
};

struct Pessoa{
    char nome[MAX];
    struct Data nascimento;
};

struct Carro{
    char marca[MAX];
    char modelo[MAX];
    int ano_carro;
    struct Pessoa proprietario;
};

int main(){
    setlocale(LC_ALL, "pt_BR.UTF-8");

    struct Carro carros[NUM];

    for (int i = 0; i < NUM ; i++){
        printf("Qual a marca do carro : %d \n",i+1);
        scanf("%29s",carros[i].marca);
        printf("Qual o modelo do carro?\n");
        scanf("%29s",carros[i].modelo);
        printf("Qual o ano do carro?\n");
        scanf("%d",&carros[i].ano_carro);
        printf("Qual o nome do dono?\n");
        scanf("%29s",carros[i].proprietario.nome);
        printf("Qual o dia em que o dono nasceu?\n");
        scanf("%d",&carros[i].proprietario.nascimento.dia);
        printf("Qual o mês em que o proprietário nasceu?\n");
        scanf("%d",&carros[i].proprietario.nascimento.mes);
        printf("Qual o ano em que o proprietário nasceu?\n");
        scanf("%d",&carros[i].proprietario.nascimento.ano);
    }
    for (int i = 0; i < NUM; i++){
        printf("\n A marca do carro é %s, modelo do carro: %s\nUm veiculo do ano de %d, no nome de: %s, que nasceu em %d de %d de %d.",
            carros[i].marca,
            carros[i].modelo,
            carros[i].ano_carro,
            carros[i].proprietario.nome,
            carros[i].proprietario.nascimento.dia,
            carros[i].proprietario.nascimento.mes,
            carros[i].proprietario.nascimento.ano);
    }
    return 0;
}