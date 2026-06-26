import random
lista = []
temporario = []
x = int(input("Quantos jogos serão sorteados: "))
for i in range(0,x):
    temporario = random.sample(range(1,60+1), 6)
    lista.append(temporario[:])
    temporario.clear()
for i in range(0,x):
    print(f"Jogo {i+1}: {lista[i]}")
print(lista)