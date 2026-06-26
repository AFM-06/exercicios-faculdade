#include <stdio.h>
#include <windows.h>
#include <string.h>

char* calcular_tarifa(float kwh){
    if(kwh>200){
        return "vermelha";
    }else if (kwh<=100){
        return "verde";
    }else{
        return "amarela";
    }
}

int adicional_tarifa(float kwh, char* tarifa){
    if(strcmp(tarifa, "vermelha") == 0){
        return kwh + kwh * 0.90;

    }else if(strcmp(tarifa, "amarela") == 0){
        return kwh + kwh * 0.75;

    }else if(strcmp(tarifa, "verde") == 0){
        return kwh + kwh * 0.60;
    }
}


void exibir(float kwh, float conta,char* tarifa){
    printf("O preço da conta ficou de R$ %.2f, na tarifa %s pelo consumo de %.0f KWh.",conta,tarifa,kwh);
}

int main(){
    SetConsoleOutputCP(CP_UTF8);

    float kwh = 0;
    float conta = 0;
    char* tarifa;
    
    printf("Quantos KWh foram consumidos?\n");
    scanf("%f",&kwh);

    tarifa = calcular_tarifa(kwh);
    conta = adicional_tarifa(kwh,tarifa);

    exibir(kwh,conta,tarifa);

}