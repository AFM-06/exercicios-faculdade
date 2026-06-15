#include <stdio.h>

int seg_horas(int entrada){
    return entrada / 3600;
}
    
    
int seg_minutos(int entrada){
    return (entrada % 3600) / 60;
}

int segundos(int entrada){
    return (entrada % 3600) % 60;
}

void exibir(int entrada){
    printf("%02d:%02d:%02d",seg_horas(entrada),seg_minutos(entrada),segundos(entrada));
}

int main(){
    int entrada;

    printf("Quantos segundos você quer converter pra horas?\n");
    scanf("%d", &entrada);

    exibir(entrada);
}

