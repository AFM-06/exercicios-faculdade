print("Bem vindo ao programa.")
totalgasto = mil = menor = conte = menornome = 0
while True:
    nome = str(input("Informe o nome do produto:  ")) 
    preço = float(input("Informe o preço do produto: R$  "))
    totalgasto+=preço
    conte+=1
    if preço>1000:
        mil+=1
    if conte == 1:
        menor = preço
        menornome = nome
    else:
        if  preço< menor:
            menor = preço
            menornome = nome
    continuar = str(input("Deseja continuar?\n[S]\n[N]\n")).upper()[0]
    if continuar == "N":
        break
print(f"O total gasto na conta foi de R$ {totalgasto:.2f}.\n{mil} Produtos custam mais de R$ 1.000.\nO nome do produto mais barato é {menornome}")

    
    