x = int(input("Informe o numéro : "))
c = x
f = 1
print("Calculando fatorial de {}! = ".format(x),end = " ")
while c>0:
    print("{} ".format(c),end =" ")
    print("x" if c>1 else "=", end = " ")
    f= f * c
    c-=1   
print("{}".format(f),end = " ")