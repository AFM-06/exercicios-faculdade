#include <stdio.h>
#include <locale.h>

float IMC(float peso, float altura){
    return peso/(altura*altura);
}

int main(){
    setlocale(LC_ALL, "pt_BR.UTF-8");
    float a = 0;
    float b = 0;
    printf("Quanto voce pesa: ");
    scanf("%f",&a);
    printf("Quanto voce mede: ");
    scanf("%f",&b);
    printf("O seu indice de massa corporal é de %.2f",IMC(a,b));

}