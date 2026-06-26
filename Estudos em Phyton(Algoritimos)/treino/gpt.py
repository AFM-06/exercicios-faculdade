# Inicialização das variáveis
loop = 0
contnum = 0
contpar = 0
contimp = 0
numeros_pares = []
numeros_impares = []

while loop != 1:
    loop = int(input("Diga um número (ou digite 1 para sair): "))
    if loop > 1:
        contnum += 1
        if loop % 2 == 0:
            contpar += 1
            numeros_pares.append(loop)
        else:
            contimp += 1
            numeros_impares.append(loop)

print(f"Foram obtidos {contnum} números, desses números {contpar} são pares e {contimp} são ímpares.")
print(f"Números pares: {numeros_pares}")
print(f"Números ímpares: {numeros_impares}")
