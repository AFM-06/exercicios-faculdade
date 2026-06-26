matriz = [
    [1, 2],
    [3, 4]
]
soma = 0
for linha in matriz:
    for elemento in linha:
        soma += elemento
print(f"A soma de todos os elementos da matriz é {soma}")