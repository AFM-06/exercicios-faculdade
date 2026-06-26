palavras = "BUSCANDO","UM","NOVO","RUMO","QUE","FAÇA","SENTIDO","NESSE","MUNDO","LOUCO"
vogais = "A","E","I","O","U"
for i in palavras:
    print(f"\nNa palavra {i} existem as vogais: ",end="  ")
    for letras in i:
        if letras.upper() in "AEIOU":
            print(f"{letras}",end = " ")