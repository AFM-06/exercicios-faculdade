linhas = 5
coluna = 5
matriz = []
for i in range (linhas):
    linha = []
    for j in range (coluna):
        if i == j :
            linha.append(linhas)
        else:
            linha.append(0)
    matriz.append(linha)
for k in matriz:
    print(k)
