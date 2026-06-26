def encontrar_elemento(matriz, elemento):
    for i in range(len(matriz)):
        for j in range(len(matriz[i])):
            if matriz[i][j] == elemento:
                return (i, j)
    return None
matriz = [
    [1, 2],
    [3, 4]
]
elemento = 3
posicao = encontrar_elemento(matriz, elemento)
if posicao:
    print(f"O elemento {elemento} está na posição {posicao}")
else:
    print(f"O elemento {elemento} não foi encontrado na matriz")