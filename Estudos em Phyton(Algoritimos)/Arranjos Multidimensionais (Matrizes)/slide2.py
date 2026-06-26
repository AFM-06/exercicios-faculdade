matriz = []
linha = 4
coluna = 4
for i in range(linha):
    linha = []
    for j in range(coluna):
        if i == j:
            linha.append(i+j+1)
        else:
            linha.append(0)
    matriz.append(linha)
for k in matriz:
    print(k)