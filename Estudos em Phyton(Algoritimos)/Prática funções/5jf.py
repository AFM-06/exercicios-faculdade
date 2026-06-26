def eleitor(a):
    if 0<a<16:
        return "não eleitor"
    elif 16<=a<=17 or a>65:
        return "eleitor facultativo"
    elif 18<=a<=65:
        return "eleitor obrigatório"
x = int(input("Qual sua idade: "))
print(f"Você é {eleitor(x)}.")