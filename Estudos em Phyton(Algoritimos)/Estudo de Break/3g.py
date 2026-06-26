import random
random = random.randint(1,10)
conte = 0
while True:
    imppar = str(input("[I]ÍMPAR\n[P]PAR\n")).upper()[0]
    jogador = int(input("imppar número?: "))
    if imppar == "I":
        if (jogador+random)  / 2 == 0:
            print("Você perdeu.")
            if conte == 0:
                print("Você não teve nenhuma vitória .")
            elif conte == 1:
                print(f"Voce teve 1 vitória .")
            elif conte>1:
                print(f"Você ganhou {conte} vezes !!")
            break
        elif (jogador+random) / 2 != 0:
            print("Você ganhou.")
            conte+=1
    if imppar == "P":
        if (jogador+random) / 2 == 0:
            print("Você ganhou")
            conte+=1
        elif (jogador+random) / 2 != 0:
            print("Você perdeu.")
            if conte == 0:
                print("Você não teve nenhuma vitória.")
            elif conte>0:
                print(f"Você ganhou {conte} vezes.")
                break
                