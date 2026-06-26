conte = some = contedois = 0
x = int(input("Informe um numero: "))
print("  Esses são os números primos ente 1 e {} :   ".format(x),end=" ")
for i in range (1,x+1):
    cont = 0
    for j in range (1, i + 1):
        if i % j == 0:
            cont+=1
    if cont == 2:
        print("{}".format(i) ,end = " ")
        some+=i
        contedois+=1
print("   .E a média aritimética deles é de {:.2f} .".format(some/contedois), end =" ")