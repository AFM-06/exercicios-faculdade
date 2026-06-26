def search(matriz,elemento):
    for i, linha in enumerate(matriz):
        for j, valor in enumerate(linha):
            if valor == elemento:
                return i, j  # Retorna a posição como uma tupla (linha, coluna)
    return None
matriz = [[1,2],[3,4]]
elemento = 3
posicao = search(matriz, elemento)
if posicao:
    print(f"O elemento {elemento} foi encontrado na posição: linha {posicao[0]}, coluna {posicao[1]}")

else:
    print("O número não está presente na matriz.")