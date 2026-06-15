#include <stdio.h>
#include <windows.h>

void ler_valores(int numeros[10]){
    for(int i = 0; i<10; i++){
        printf("Qual o numero %d?\n", i + 1);
        scanf("%d", &numeros[i]);
    }
}
int menor_valor(int numeros[10],int menor){
    menor = numeros[0];
    for(int i = 1; i<10; i++){
        if(numeros[i]<menor){
            menor = numeros[i];
        }
    }
    return menor;
}
int maior_valor(int numeros[10],int maior){
    maior = numeros[0];
    for(int i = 1; i<10; i++){
        if(numeros[i]>maior){
            maior = numeros[i];
        }
    }
    return maior;
}
int soma(int numeros[10],int soma_total){
    for(int i = 0; i<10; i++){
        soma_total+=numeros[i];
    }
    return soma_total;
}
int media_dos_numeros(int soma_total){
    return soma_total/10;
}
void exibir(int media, int maior, int menor, int soma_total){
    printf("O maior e o menor número dessa sequência foram respectivamente %d e %d, a media dos números %d e a soma total deles %d.",maior,menor,media,soma_total);
}

int main(){
    SetConsoleOutputCP(CP_UTF8);

    int numeros[10];
    int media = 0,maior = 0,menor = 0,soma_total = 0;

    ler_valores(numeros);
    menor = menor_valor(numeros, menor);
    maior = maior_valor(numeros, maior);
    soma_total = soma(numeros,soma_total);
    media = media_dos_numeros(soma_total);
    
    exibir(media,maior,menor,soma_total);

    return 0;

}