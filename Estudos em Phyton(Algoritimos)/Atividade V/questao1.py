cont = 0
print("Esses são os números divisíveis por 3 e 5 entre 1 e 200: \n")
for i in range (1,200):
    if i % 3 == 0 and i % 5 == 0:
        cont=cont+1
        
        print(i) 
print("\nExistem {} números divisíveis por 3 e por 5 entre 1 e 200 . ".format(cont))
        