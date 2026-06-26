matriz = []
matrizb = []
linhas = 3
coluna = 3
import random
for i in range(linhas):
    linha = []
    for j in range(coluna):
        linha.append(random.randint(10,30))
    matriz.append(linha)
for i in matriz:
    print(i)
print()
for i in range(linhas):
    linha =[]
    for j in range(coluna):
        linha.append(random.randint(10,30))
    matrizb.append(linha)
for i in matrizb:
    print(i)
print()
resultado = []
for i in range(linhas):
    linha = []
    for j in range(coluna):
        linha.append(matriz[i][j]+matrizb[i][j])
    resultado.append(linha)
for i in resultado:
    print(i)