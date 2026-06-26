conta = soma = 0
x = -1

while x != 999:
    x = int(input("Digite um número: "))
    conta+=1
    soma+=x
    if x == 999:
      print("Acabou.")
print("A soma entre eles é de {}. ".format(soma-999))