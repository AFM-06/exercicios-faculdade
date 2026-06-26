def contar_digitos(n):
    if n<9:
        return 1
    else:
        return contar_digitos(n//10) + 1
n = 54245
print(contar_digitos(n))