a = 1
b = 2
while (a <7) :
    a = b + a
    while True :
        b = a + b
        a = a +1
        if(b >=9) :
            break
print ( a )
print ( b )