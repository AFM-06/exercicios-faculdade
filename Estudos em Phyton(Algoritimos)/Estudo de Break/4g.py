print("Bem vindo ao cadastro de pessoas .")
homens = mulheres = dezoito = mulheresvinte = 0
while True:
    idade = int(input("Informe a idade: "))
    sexo = str(input("Homem ou mulher? ")).upper().strip()
    if idade >= 18:
        dezoito+=1
    if sexo == "HOMEM":
        homens+=1
    if sexo == "MULHER" and idade<20:
        mulheresvinte+=1
    continuar = str(input("Você deseja continuar?\n[S]SIM\n[N]NÃO\n")).upper()[0]
    if continuar == "N":
        print(f"Existem {dezoito} pessoas maiores de dezoito anos. ")
        print(f"Foram cadastrados {homens} homens. ")
        print(f"Possui {mulheresvinte} mulheres abaixo de 20 anos.")
        break
    if continuar == "S":
        print("\n")
    
