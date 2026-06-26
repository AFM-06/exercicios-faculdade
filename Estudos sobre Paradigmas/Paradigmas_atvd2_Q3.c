#include <stdio.h>
#include <windows.h>

float calcular_comissao(float salario,float comissao);
float calcular_salario_final(float salario,float comissao);
void exibir_resultado(float salario, float comissao);

int main(){
    SetConsoleOutputCP(CP_UTF8);

    float salario;
    float comissao;
    printf("Qual o salário?\n");
    scanf("%f",&salario);

    exibir_resultado(salario,comissao);

}
float calcular_comissao(float salario,float comissao){
    if(salario>=10000){
        return comissao = salario + (salario*0.10);
    }else{
        return comissao = salario + (salario*0.05);
    }
}

float calcular_salario_final(float salario, float comissao){
    return comissao+salario;
}

void exibir_resultado(float salario, float comissao){
    printf("O salário foi de R$ %.2f.\nA comissão foi de R$ %.2f.\nE o salário final foi de R$ %.2f.",salario,calcular_comissao(salario,comissao),calcular_salario_final(salario,comissao));
}