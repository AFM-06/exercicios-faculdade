loop = -2
soma = conta = 0
while (loop != -1):
    horas = int(input("Quantas horas o funcionário trabalhou? "))
    if horas>0:
        soma+=horas
        conta += 1
    if horas == -1:
        loop = -1
print("A média de horas trabalhadas pelo funcionário são de {:.2f} H . ".format(soma/conta))