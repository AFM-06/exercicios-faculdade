matriz = [
    [1, 2, 3],
    [4, 5, 6]
]
matriz_transposta = [[0, 0], [0, 0], [0, 0]]
for i in range(len(matriz)):
    for j in range(len(matriz[0])):
        matriz_transposta[j][i] = matriz[i][j]
print("Matriz Transposta:")
for linha in matriz_transposta:
    print(linha)