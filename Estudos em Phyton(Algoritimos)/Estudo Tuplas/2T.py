contepos = 0
conteneg = -1
posicoes = ("Primeiro","Segundo","Terceiro","Quarto","Quinto","Sexto","Setimo","Oitavo","Nono","Decimo","Decimo-primeiro","Decimo-segundo","Decimo-terceiro","Decimo-quarto","Decimo-quinto","Decimo-sexto","Decimo-setimo","Decimo-oitavo","Decimo-nono","Vigésimo")
for i in range(0,5):
    print(posicoes[i])
print("_______________________________________")
while True:
    print(posicoes[conteneg])
    conteneg-=1
    contepos+=1
    if contepos == 4:
        break
print("________________________________________")
print(sorted(posicoes))
print("________________________________________")
print(f"Sexto está na posição { posicoes.index("Sexto") } .")
