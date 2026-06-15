#include <stdio.h>
#include <windows.h>
#include <string.h>

#define TAMANHO 2

struct Aluno{
    float nota1,nota2;
    char nome[50];
    float media;
    char situacao[10];

};
void calcular_media(struct Aluno alunos[]){
    for(int i = 0; i < TAMANHO; i++){
        printf("Qual o nome do aluno?\n");
        scanf("%s",&alunos[i].nome);
        printf("Qual a primeira nota?\n");
        scanf("%f",&alunos[i].nota1);
        printf("Qual a segunda nota?\n");
        scanf("%f",&alunos[i].nota2);
        alunos[i].media = (alunos[i].nota1 + alunos[i].nota2) / 2;
    }
}
void classificar_situacao(struct Aluno alunos[]){
    for(int i = 0; i < TAMANHO; i++){
        if(alunos[i].media>=7){
            strcpy(alunos[i].situacao,"Aprovado");
        }else{
            strcpy(alunos[i].situacao,"Reprovado");
        }
    }
}
float media_turma(struct Aluno alunos[]){
    float media_turma=0;
    for(int i = 0; i < TAMANHO; i++){
        media_turma+=alunos[i].media;
    }
    return media_turma/TAMANHO;
}
void exibir(struct Aluno alunos[]){
    for(int i = 0; i < TAMANHO; i++){
        printf("Aluno: %s || Media: %.2f || Situação: %s.\n",alunos[i].nome,alunos[i].media,alunos[i].situacao);
    }
    printf("Media da turma: %.2f.\n",media_turma(alunos));
}



int main(){
    SetConsoleOutputCP(CP_UTF8);

    struct Aluno alunos[TAMANHO];

    calcular_media(alunos);
    classificar_situacao(alunos);
    exibir(alunos);


}