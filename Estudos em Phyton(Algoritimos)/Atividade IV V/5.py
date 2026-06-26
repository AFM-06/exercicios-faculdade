loop = -1
area_da_casa = 0
casa = ["SALA","COZINHA","BANHEIRO","QUARTO","quarto","sala","cozinha","banheiro"]
fim = ["SAIR DO PROGRAMA","sair do programa","fim","FIM","SAIR","sair"]
while (loop != 0):
    comodo = input("Qual o comódo?\n~~~~~~~~~~~~~~~~~~~~~~\n[SALA]\n[COZINHA]\n[BANHEIRO]\n[QUARTO]\n~~~~~~~~~~~~~~~~~~~~~~\n[SAIR DO PROGRAMA]\n").strip()
    if comodo in fim:
        loop = 0
    if comodo in casa:
        largura = float(input("Qual a largura do(a) {} em Metros?  ".format(comodo)))
        comprimento = float(input("Qual o comprimento do() {} em Metros?  ".format(comodo)))
        area_da_casa+=largura*comprimento
print("\nA area total da casa é de {} M².\n".format(area_da_casa))