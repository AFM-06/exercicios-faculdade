conte = some = quantid = x = maior = menor = 0
y ="S"
while y != "N":
    if y == "S" and y != "N" :
        x = int(input("Digite um número: "))
        y = str(input("Quer continuar?\n[S]\n[N]\n")).upper().strip()[0]
        conte+=1
        some+=x
        quantid+=1
        if quantid == 1:
            maior = menor = x
        else:
            if x > maior:
                maior = x
            if x < menor:
                menor = x
print("A média entre os números é de {} , e o maior número fornecido foi {} e o menor foi {}. ".format(some/conte,maior,menor))