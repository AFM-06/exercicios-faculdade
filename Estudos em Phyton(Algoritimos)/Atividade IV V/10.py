loop = "oi"
while (loop != "ei"):
    x = float(input(""))
    y = float(input(""))
    fazer = input("Oque deseja fazer?\n[ADICAO]\n[SUBTRAÇÃO]\n[MUTIPLICAÇÃO]\n[DIVISAO]\n").upper().strip()
if fazer == "ADICAO":
    print(x+y)
elif fazer == "SUBTRAÇÃO":
    print(x-y)
elif fazer == "MUTIPLICAÇÃO":
    print(x*y)
elif fazer == "DIVISÃO":
    print(x/y)
deseja = input("Deseja fazer outra operação?\n[SIM]\n[NAO]\n").upper().strip()
if deseja == "NAO":
    loop = "ei"