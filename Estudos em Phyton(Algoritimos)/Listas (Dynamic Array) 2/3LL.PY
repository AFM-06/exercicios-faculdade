contador = 0
listaum = []
listadois = [] 
listatres =  []
coluna = 0
linha = 0
for i in range(0,9):
    x = int(input(f"Digite um número para a posição {linha},{coluna}: "))
    contador+=1
    if contador<= 3:
        listaum.append(x)
        coluna+=1
        if coluna == 3:
            coluna = 0
            linha+=1
    if 6>=contador>3:
        listadois.append(x)
        coluna+=1
        if coluna == 3:
            coluna = 0
            linha+=1
    elif contador>6:
        listatres.append(x)
        coluna+=1
print(" ----------------------- ")
print(f"I  {listaum[0]}  I  {listaum[1]}   I  {listaum[2]}   I")
print(" ----------------------- ")
print(f"I  {listadois[0]}  I  {listadois[1]}   I  {listadois[2]}   I")
print(" ----------------------- ")
print(f"I  {listatres[0]}  I  {listatres[1]}   I  {listatres[2]}   I")
print(" ----------------------- ")



    