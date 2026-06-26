conte = 0
lista = []
while True: 
    x = int(input("Digite um valor: "))
    lista.append(x)
    conte+=1
    continuar = str(input("Deseja continuar? ")).upper()
    if continuar == "N":
        break
lista.sort(reverse=True)
print(f"Existem {len(lista)} na lista.")
print(lista)
if 5 in lista:
    print("O número 5 está na lista.")
else:
    print("O numero 5 não foi digitado.")
