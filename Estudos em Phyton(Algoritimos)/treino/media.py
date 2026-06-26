loop = 1
conte = some = 0
while loop != 0:
    x = int(input("Informe um número: "))
    if x == 0:
        loop = 0
    if x>0:
        some+=x
        conte+=1
print("A media dos numeros fornecidos é de {}.".format(some/conte))