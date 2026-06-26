conte = soma = quantidade = maior = some_s = 0
loop = -2
while loop != -1: 
    loop = float(input("Informe o salário:  "))
    if loop == -1:
        break
    filhos = int(input("Quantos filhos tem?  "))
    conte+=1
    soma+=filhos
    some_s+=loop
    quantidade+=1
    if quantidade == 1:
        maior = loop
    else:
        if loop > maior:
         maior = loop
print("A média salarial da população é de R$ {:.2f} , a média de filhos é de {} , e o maior salário é de R$ {:.2f} .".format(some_s/conte,soma/conte,maior))
    
