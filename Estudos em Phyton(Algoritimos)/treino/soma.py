preco = 37.41
creatina = 150
precoporg = creatina /3 and preco/3
print(precoporg)
for i in range (10):
    print(f"R$ {preco:.2f}")
    print(f"{creatina:.2f} G")
    print("________")
    preco+= 37.41
    creatina+=150
