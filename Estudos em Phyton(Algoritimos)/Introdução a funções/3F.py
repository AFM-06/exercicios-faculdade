def contador(a,b,c):
    print("\nDe 1 em 1: ")
    for i in range(1,11,1):
        print(i,end=" ")
    print("\nDe 10 a 0, em 2 e 2: ")
    for i in reversed(range(0,11,2,)):
        print(i,end=" ")
    print("\nContagem Personalizada: ")
    if x>y:
        for i in reversed(range(y,x+1,z)):
            print(i,end=" ")
    else:
        for i in range(x,y+1,z):
            print(i,end=" ")
x = int(input("Inicio: "))
y = int(input("Fim: "))
z = int(input("Passo: "))
contador(x,y,z)