#include <stdio.h>
#include <windows.h>

int verificar_triangulo(int a, int b, int c){
    if(a < b + c && b < a + c && c < a + b){
        return 1;
    }else{
        return 0;
    }
}

char* classificar_tipo_triangulo(int a,int b, int c){
    if(verificar_triangulo(a, b, c)){
        if(a == b && b == c){
            return "Triangulo equilátero";
        }else if (a != b && a != c && c != b){
            return "Triangulo escaleno";
        }else{
            return "Triangulo isóceles";
        }
        
    }else{
        printf("Não é um triangulo.");
    }
}

void exibir(int a, int b, int c){
    printf("%s",classificar_tipo_triangulo(a,b,c));
}

int main(){
    SetConsoleOutputCP(CP_UTF8);

    int lado1,lado2,lado3;

    printf("Qual os lados do triangulo?");
    scanf("%d %d %d",&lado1,&lado2,&lado3);

    exibir(lado1,lado2,lado3);

    return 0;

}