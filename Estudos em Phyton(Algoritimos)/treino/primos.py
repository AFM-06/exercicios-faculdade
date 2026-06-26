conte = 0
conte = 0
some = 0
x = int(input("Informe um número: "))
print("Esses são os números primos que existem no intervalo 1 a {}: ".format(x))
for i in range(1,x +1):
    cont = 0
    for j in range( 1, i+1):
        if i % j == 0:
            cont+=1
    if cont == 2:
        print(i)
        conte+=1
        some+=i
print("Como pode ver, existem {} números primos entre 1 e {}, e a média aritimética da soma dos números primos é de {}. ".format(conte,x,some/conte))