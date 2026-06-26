lista = []
while True:
    x = int(input("Digite um valor: "))
    lista.append(x)
    continuar = str(input("Deseja continuar? ")).upper()
    if continuar == "N":
        break
lista.sort()
listapar = []
listaimpar = []
for i in range (len(lista)):
    if lista[i] % 2 == 0:
        listapar.append(lista[i])
    else:
        listaimpar.append(lista[i])
print(lista)
print(listapar)
print(listaimpar)