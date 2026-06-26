#include <stdio.h>
#include <windows.h>

void sacar_dinheiro(int dinheiro){
    int nota_100 = 0;
    int nota_50 = 0;
    int nota_20 = 0;
    int nota_10 = 0;
    int nota_5 = 0;
    int nota_2 = 0;
    int moeda_1 = 0;
    
    printf("%d\n",dinheiro);
    while(dinheiro>0){
        if(dinheiro>=100){
           dinheiro-=100;
           nota_100++;
        }else if (dinheiro>=50){
            dinheiro-=50;
            nota_50++;
        }else if(dinheiro>=20){
            dinheiro-=20;
            nota_20++;
        }else if(dinheiro>=10){
            dinheiro-=10;
            nota_10++;
        }else if(dinheiro>=5){
            dinheiro-=5;
            nota_5++;
        }else if(dinheiro>=2){
            dinheiro-=2;
            nota_2++;
        }else{
            dinheiro-=1;
            moeda_1++;
        }
    }

    if(nota_100>0){printf("%d nota de R$ 100, ",nota_100);}
    if(nota_50>0){printf("%d nota de R$ 50, ",nota_50);}
    if(nota_20>0){printf("%d nota de R$ 20, ",nota_20);}
    if(nota_10>0){printf("%d nota de R$ 10, ",nota_10);}
    if(nota_5>0){printf("%d nota de R$ 5, ",nota_5);}
    if(nota_2>0){printf("%d nota de R$ 2, ",nota_2);}
    if(moeda_1>0){printf("%d moeda de R$ 1",moeda_1);}
    printf(".");
}

int main(){
    SetConsoleOutputCP(CP_UTF8);

    int dinheiro;

    printf("Qual o dinheiro que deseja sacar?\n");
    scanf("%d",&dinheiro);

    sacar_dinheiro(dinheiro);



}