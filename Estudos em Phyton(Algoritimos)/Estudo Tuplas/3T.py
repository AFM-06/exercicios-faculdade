import random #5 NUMERO E DIZ QUAL O MAIOR E O MENOR
numeros = random.sample(range(1,101), 5)
conte = maior = menor =0
print("Os números são: ")
for i in range (0,5):
    print(numeros[i])
    conte+=1
    if conte == 1:
        maior = menor = numeros[0]
    else:
        if numeros[i] > maior:
           maior = numeros[i]
        if numeros[i]<menor:
          menor = numeros[i]
print("_________________________")
print(f"O maior número é {maior}.")
print(f"O menor número é {menor}.")    