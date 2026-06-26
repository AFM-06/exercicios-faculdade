#include <stdio.h>
#include <string.h>

void ler_notas(float notas[]);
float calcular_media(float notas[]);
void ver_situacao(float media,char situacao[]);
void exibir_resultado(char situacao[], float media, char nome_aluno[]);

int main(){
    float notas[3];
    char nome_aluno[40];
    float media;
    char situacao[20];

    printf("Qual o nome do aluno?\n");

    fgets(nome_aluno, sizeof(nome_aluno), stdin);
    nome_aluno[strcspn(nome_aluno, "\n")] = '\0';
    
    ler_notas(notas);
    media = calcular_media(notas);
    ver_situacao(media,situacao);
    exibir_resultado(situacao,media,nome_aluno);


    return 0;
}
void ler_notas(float notas[]){
    for(int i = 0; i<3;i++){
        printf("Qual a nota %d?\n",i+1);
        scanf("%f", &notas[i]);
    }
}
float calcular_media(float notas[]){
    float soma_das_notas = 0;
    for(int i = 0; i<3;i++){
        soma_das_notas += notas[i];
    }
    return soma_das_notas / 3;
}
void ver_situacao(float media,char situacao[]){
    if(media >= 7){
        strcpy(situacao, "Aprovado");
    }else if (media >= 4 && media < 7){
       strcpy(situacao, "Recuperacao");
    }else{
        strcpy(situacao, "Reprovado");
    }
}
void exibir_resultado(char situacao[], float media, char nome_aluno[]){
        printf("O aluno %s ficou com media %.2f\nSituacao: %s",nome_aluno,media,situacao);
}