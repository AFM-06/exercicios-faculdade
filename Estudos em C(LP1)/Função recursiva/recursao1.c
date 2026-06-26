#include <stdio.h>

int mut(int num1, int num2){
    if(num2==1){
        return num1;
    }
    return num1 + mut(num1,num2-1);
}
    


int main(){
    int x = 5;
    int z = 3;
    printf("%d",mut(x,z));
}