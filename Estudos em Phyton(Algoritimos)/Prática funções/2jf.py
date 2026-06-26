def passagem(a):
    if a<=200:
        r = a*0.50
        return r
    else:
        r = a*0.65
        return r
x = int(input("Quantos KM de viagem: "))
print(f"O valor da viagem será de R$ {passagem(x)}.")
