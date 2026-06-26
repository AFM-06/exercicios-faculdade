loop = -1
x = float(input("Digite um número: "))
y = float(input("Digite outro número: "))
while loop != 0:
    z = int(input("[1]SOMAR\n[2]MUTIPLICAR\n[3]MAIOR\n[4]NOVOS NÚMEROS\n[5]SAIR DO PROGRAMA\n "))
    if z == 5:
        print("Bye bye")
        loop = 0
    elif z == 1:
        print("A soma de {} e {} é {}.".format(x,y,x+y))
    elif z == 2:
        print("O resultado da mutiplicaçào de {} e {} é igual a {}.".format(x,y,x*y))
    elif z == 3:
        if x>y:
            print("O maior número é {}".format(x))
        elif x<y:
            print("O maior número é {}".format(y))
    elif z == 4 :
        x = float(input("Digite um número: "))
        y = float(input("Digite outro número: "))