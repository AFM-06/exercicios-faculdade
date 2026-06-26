conta = 0
x = float(input("Qual a população inical ?\n"))
y = float(input("Qual a taxa de crescimento populacional?\n %"))
taxa = (x*y)/100
soma = x
for i in range(1,61):
    soma = soma  +  taxa
    conta = conta + 1
    print("Mes {:.2f} -> {:.2f} . ".format(conta, soma))
    