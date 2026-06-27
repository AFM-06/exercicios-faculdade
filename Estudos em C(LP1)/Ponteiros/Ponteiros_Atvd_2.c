#include <stdio.h>

void dobrar(int *x) {
    return *x = *x * 2; 
}

int main() {
    int num;

    printf("Digite um número: ");
    scanf("%d", &num);

    dobrar(&num);

    printf("Valor dobrado: %d\n", num);

    return 0;
}
