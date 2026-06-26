n = 5
def naturais(n):
    if n == 0:
        return 0
    else:
        return naturais(n-1) + n
print(naturais(n))
