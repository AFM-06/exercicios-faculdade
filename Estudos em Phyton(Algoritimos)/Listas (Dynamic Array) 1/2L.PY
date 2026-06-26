lista = []
while True:
    x = int(input("Digite um valor: "))
    continuar = str(input("Deseja continuar?\n[S]SIM\n[N]NÃO\n")).upper()
    if x not in lista:
        lista.append(x)
    if continuar == "N":
        break
    if continuar != "S":
        print("Resposta inválida, tente novamente")
print("-"*35)
print("Aqui estão os números da lista em ordem crescente:")
lista.sort()
for i in range(len(lista)):
    print(lista[i])