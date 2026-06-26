conte = 0
some = 0
for i in range(1,101,2):
    conte = conte + 1
    some = some + i
print("Existem {} números pares entre 1 e 100".format(conte))
print("A soma de todos os numeros pares é de {}, e a média é de {}. ".format(some,some/conte))
