print("A:")

A = [[1,3],
     [5,7],
     [9,11]]

for i in A:
    print(i)

print()

print("B:")

B = [[4,8,10],
     [14,5,7]]

for i in B:
    print(i)
    
print()
transposta = []
resultado = []

#transpondo.
for i in range(len(A[0])): #Ler o numero de Colunas. (0,1)
    linha = []
    for j in range (len(A)): #Ler o número de Linhas. (0,1,2)
        linha.append(A[j][i]) #[0][0] até [2][0] 1,5,9 ----- [0][1] 3,7,11
    transposta.append(linha)

print("Transposta:")
for i in transposta:
    print(i)

print()

A = transposta
for i in range(len(A)):
    linha = []
    for j in range(len(A[0])):
        linha.append(A[i][j]*B[i][j])
    resultado.append(linha)

print("Soma A*B:")

for i in resultado:
    print(i)
#Como somar 2 matrizes? nesse caso eu precisei fazer uma matriz transposta da matriz A , e agora irei expliar o processo de transpor uma matriz para outra.
#primeiro é preciso ler o numéro de colunas, esse vai ser o número das novas linhas da matriz transposta, depois ler o número de linhas (3) para poder pegar o primeiro item de cada lista, e depois o segundo