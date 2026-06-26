temporario = []
pares = []
impares = []
listageral = []
for i in range(0,7):
    x = int(input("Informe um número: "))
    if x % 2 == 0:
        temporario.append(x)
        pares.append(temporario[:])
        temporario.clear()
    else:
        temporario.append(x)
        impares.append(temporario[:])
        temporario.clear()
sorted(impares)
listageral.append(impares)
sorted(pares)
listageral.append(pares)
print(f"Impares: {listageral[0]} .")
print(f"Pares: {listageral[1]} .")