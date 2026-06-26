def numprimo(x):
    conte=0
    for i in range(1,x+1):
        if x % i == 0:
            conte+=1
    if conte == 2:
        r = 'é'
        return r
    else:
        r = 'não é'
        return r
x = int(input("Informe um número: "))
print(f"O número {x} {numprimo(x)} primo.")