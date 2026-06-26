contpar = contimp = contnum = loop = 0
while (loop != 1):
    loop = int(input("Diga um número: "))
    if loop>1:
        contnum+=1
        if loop % 2 == 0:
            contpar+=1           
        else:
            contimp+=1
print("Foram obtidos {} números, desses números {} sao pares e {} impares.".format(contnum,contpar,contimp))
