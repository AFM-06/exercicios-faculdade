def soma_n(n):
    if n == 0 :
        return 0
    elif n == 1:
        return 1
    else:
        return soma_n(n-1) + n
print(soma_n(10))