#include <stdio.h>

void trocar(int *x, int *y) {
    int aux = *x;
    *x = *y;
    *y = aux;

}

int main() {
    int a, b;

    printf("Digite dois valores inteiros:\n");
    scanf("%d %d", &a, &b);

    printf("Antes da troca: a = %d, b = %d\n", a, b);

    trocar(&a,&b);

    printf("Depois da troca: a = %d, b = %d\n", a, b);

    return 0;
}
