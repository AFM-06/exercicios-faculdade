eterno = []
efemero = []
cont = 0
while True:
    efemero.append(str(input("Nome: ")))
    efemero.append(float(input("Nota 1: ")))
    efemero.append(float(input("Nota 2: ")))
    eterno.append(efemero[:])
    efemero.clear()
    cont+=1
    confirmar = str(input("Deseja continuar?"))
    if confirmar in "nN":
        break
print("\nBoletins:")
for i in range (0,cont):
    if eterno[i][1]>0 and eterno[i][2]>0:
        print(f"Aluno(a): {eterno[i][0]}, Média geral: {(eterno[i][1]+eterno[i][2])/2} .")
    if eterno[i][1] == 0 and eterno[i][2] == 0:
        print(f"Aluno(a): {eterno[i][0]}, Média geral: 0.")
confirmar2 = str(input("\nDeseja ver a nota de algum aluno: "))
if confirmar2 in "nN":
    print("OK!")
if confirmar2 in "sS":
    while True:
        for i in range(0,len(eterno)):
            print(f"Aluno {i+1}: {eterno[i][0]}")
        pergunta = int(input("Deseja ver a nota de qual aluno: "))
        print(f"As duas notas de {eterno[pergunta-1][0]} foram: {eterno[pergunta-1][1]} e {eterno[pergunta-1][2]} ")
        outrapergunta = str(input("\nDeseja ver a nota de mais algum aluno: "))
        if outrapergunta in "nN":
            print("Finalizando processos...")
            print("Puff!!")
            break

