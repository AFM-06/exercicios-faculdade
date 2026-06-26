def fibas(n):
    if n == 0:
        return 0
    elif n == 1 or n == 2:
        return 1
    else:
        return fibas(n-1) + fibas(n-2)
print(fibas(9))