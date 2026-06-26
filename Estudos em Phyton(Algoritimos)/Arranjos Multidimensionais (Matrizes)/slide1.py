coluna = 3
linha = 3
matriz = []
conte = 1
for i in range(linha):
    linha = []
    for j in range (coluna):
        linha.append(conte)
        conte*=2
    matriz.append(linha)
for k in matriz:
    print(k)