loop = -1
soma = 0
while (loop != 0):
    n = int(input("Informe um número: "))
    if n<0:
        loop = 0
    if n> 0:
        soma+=n
print("A soma de todos os números inseridos é de {}.".format(soma))