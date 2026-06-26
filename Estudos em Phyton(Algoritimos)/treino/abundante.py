soma=0
x = int(input("Informe um número: "))
for i in range(1,x+1):
      if x % i == 0 and i != x:
        soma+=i
if soma>x:
   print("é um numero abundante")
else:
   print("Não é um numero abundante")
