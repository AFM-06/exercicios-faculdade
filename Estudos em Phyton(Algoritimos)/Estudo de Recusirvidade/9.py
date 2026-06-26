def fat(n):
    if n<=0:
        return 0
    elif n == 1:
        return 1
    else:
        return fat(n-1) * n
print(fat(100))