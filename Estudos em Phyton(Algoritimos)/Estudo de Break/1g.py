sacado = int(input("Qual o valor a ser sacado? "))
while True:
#Aqui é onde vai dizer quantas notas de cada eu preciso usar, eu pego o valor e faço igual na vida real, começo verificando pelo maior.
    cinquenta = sacado // 50 #Quantas nota de 50 cabe dentro do valor, e se tiver resto (algum valor abaixo de 50) ele passa pra verificar o 20.
    restocinquenta = sacado % 50 #pegando o resto de 50 e usando pra verificar o 20.
    vinte = restocinquenta // 20
    restovinte = restocinquenta % 20
    dez = restovinte // 10
    restodez = restovinte % 10
    um = restodez // 1
#E assim vai.
    break
#Ai aqui é só pra printar se tiver o valor né, caso seja 1 real eu nao vou querer falando q é 0 de cinquenta, 0 de vinte e 0 de dez.
if cinquenta>0:
    print(f"Cinquenta: {cinquenta}.")
if vinte>0:
    print(f"Vinte: {vinte}.")
if dez>0:
    print(f"Dez: {dez}.")
if um>0:
    print(f"Um real: {um}.")