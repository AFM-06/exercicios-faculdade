data = list()
pessoas = dict()
above_the_normal = list()
soma = 0
while True:
    pessoas.clear()
    pessoas['nome'] = str(input("Nome: "))
    pessoas['sexo'] =  str(input("Sexo: ")).upper()[0]
    while pessoas['sexo'] != "M" and pessoas['sexo'] != "F":
        print("Valor inexistente, tente novamente.1")
        pessoas['sexo'] =  str(input("Sexo: "))
    pessoas['idade'] =  int(input("idade: "))
    while pessoas['idade']<0:
        print("Valor inexistente, tente novamente.2")
        pessoas['idade'] =  int(input("idade: "))
    data.append(pessoas.copy())
    continuar = str(input("Deseja continuar?\n[S]/[N]\n")).upper()
    while continuar != "S" and continuar != "N":
        print("Valor inexistente, tente novamente.3")
        continuar = str(input("Deseja continuar?\n[S]/[N]\n"))
    if continuar == "N":
        break
    soma+=pessoas["idade"]
print(f"A) Foram cadastradas {len(data)} pessoas.")
print(f"B) A média das idades é de {soma/len(data):.2f} .")
conte = 0
for p in data:
    if p['sexo'] == "F":
        conte+=1
if conte>0:
    print("C) Essas foram as mulheres cadastradas: ",end=" ")
    for p in data:
        print(f"{p},",end=".")
else:
    print("Não tiveram mulheres nessa lista.")
for p in data:
    if p['idade'] >= soma/len(data):
        for i,j in p.items():
            print(f"{i} = {j}.")


        