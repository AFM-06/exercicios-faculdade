cont = 0
x = int(input("informe um número: "))
i = 1
j = 1
while (x > i):
    cont= 0
    while(i < j ):
        if i % j == 0:
            cont = 0
            print(cont)
        j+= 1
    if cont == 2:
        print(i)
    i += 1