temporario = []
gordos = []
magros = []
conte = conte_gordos_0 = conte_magros = 0
while True:
    nome = str(input("Nome: "))
    peso = int(input("Peso: "))
    if peso>=100:
        temporario.append(nome)
        temporario.append(peso)
        gordos.append(temporario[:])
        temporario.clear()
        conte_gordos_0+=1
    elif peso<=70:
        temporario.append(nome)
        temporario.append(peso)
        magros.append(temporario[:])
        temporario.clear()
        conte_magros+=1
    continuar = str(input("Deseja continuar? ")).upper()
    conte+=1
    if continuar in "nN":
        break
if conte>1:
    print(f"Foram cadastradas {conte} pessoas.")
else:
    print("Só foi cadastrada 1 pessoa.")
if conte_gordos_0>1:
    print("As pessoas mais pesadas : ",end=" ")
    for i in gordos:
        print(i[0],end=", ")
if conte_magros>1:
    print("\nAs pessoas mais magras: ",end=" ")
    for m in magros:
        print(m[0],end=" ") 
elif conte_gordos_0 == 1:
    print(f"Apenas o(a) {gordos[0][0]} entrou na lista dos mais gordos.")
elif conte_magros == 1:
    print(f"Apenas o(a) {magros[0][0]} entrou na lista dos mais magros.")
