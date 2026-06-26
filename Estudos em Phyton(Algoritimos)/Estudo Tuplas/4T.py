tupla = int(input("Digite um numero: ")),int(input("Digite outro numero: ")),int(input("Mais um numero: ")),int(input("ultimo: "))
print("~~~~~~~~~~~~~~~~~~~~~~~~~~")
print(tupla)
print("~~~~~~~~~~~~~~~~~~~~~~~~~~")
for i in range(0,4):
    if tupla[i]> 0:
        if tupla[i] % 2 == 0:
            print(f"Numeros pares: {tupla[i]}")
print("~~~~~~~~~~~~~~~~~~~~~~~~~~")
for i in range(0,4):
    if tupla[i] == 3:
        print(f"Numero 3 aparece na posicao {tupla.index(3)}")