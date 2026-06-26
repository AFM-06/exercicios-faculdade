def calculadora(a,b,c):
    if c == 1:
        r = a+b
        return r
    elif c == 2:
        r = a-b
        return r
    elif c == 3:
        r = a/b
        return r
    elif c == 4:
        r = a*b
        return r
    else:
        return("Valor inválido")
x = int(input("Digite um número: "))
y = int(input("Digite outro número: "))
z = int(input("Que tipo de operação? "))
print(f"O resultado é {calculadora(x,y,z)}.")