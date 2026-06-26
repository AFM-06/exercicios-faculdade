#3: Escreve os números N(recursivo - 1) em ordem decrescente, assim:
def recursiva(n):
    if n<= 0:
        return 0
    else:
        print(n)
        return recursiva(n-1)
recursiva(5)
