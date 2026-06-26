soma = 0
conta = 0
preco_carro = float(input("Informe o preço do carro:\n"))
taxa_de_depreciacao = float(input("Qual a taxa de depreciação ? :\nEm %: "))
tempo = int(input("Por quantos anos?\n"))
mensal = (tempo * 12) + 1
taxa = (taxa_de_depreciacao / 100)/12
valor_da_taxa = preco_carro * taxa

for i in range(1,mensal):
    conta+=1 #correto.
    soma +=valor_da_taxa * i
    preco_e_soma = preco_carro-soma
    print("Mes {}, o preço do carro é de R${:.2f} e baixou para R$ {:.2f} .".format(conta,preco_carro,preco_carro-soma))
print("O preço total da depreciação foi de R$ {:.2f} .".format(float(preco_carro-preco_e_soma))) #Correto.

