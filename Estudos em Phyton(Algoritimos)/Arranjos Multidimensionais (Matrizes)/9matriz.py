matriz = [
    [1, 2, 3],
    [4, 5, 6]
]
somas_linhas = []
for linha in matriz:
    soma = sum(linha)
    somas_linhas.append(soma)
for i, soma in enumerate(somas_linhas):
    print(f"A soma dos elementos da linha {i+1} é {soma}")