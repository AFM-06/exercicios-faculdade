def somaPares(n):
    if 2 > n:
        return 0 
    elif n % 2 != 0:
        return somaPares(n-1)
    else:
        return n + somaPares(n-2)
print(somaPares(10))
