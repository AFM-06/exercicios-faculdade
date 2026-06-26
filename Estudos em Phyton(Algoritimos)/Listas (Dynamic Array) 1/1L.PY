lista = [4,5,1,6,7]
conte = 0
conte_lista = 0
lista.append(int(input("Num: ")))
for i in range(5):
    x = int(input("num: "))
    for j in lista:
        if x>j:
            lista.insert(x,j+1)
        else:
            lista.insert(x,j)
print(lista)