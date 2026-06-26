def determinante_3x3(matriz):
    det = (
        matriz[0][0] * matriz[1][1] * matriz[2][2] +
        matriz[0][1] * matriz[1][2] * matriz[2][0] +
        matriz[0][2] * matriz[1][0] * matriz[2][1] -
        matriz[0][2] * matriz[1][1] * matriz[2][0] -
        matriz[0][0] * matriz[1][2] * matriz[2][1] -
        matriz[0][1] * matriz[1][0] * matriz[2][2]
    )
    return det
matriz = [
    [1, 2, 3],
    [0, 1, 4],
    [5, 6, 0]
]
det = determinante_3x3(matriz)
print(f"O determinante da matriz é {det}")