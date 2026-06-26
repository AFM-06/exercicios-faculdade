list = []
num1 = int(input("Informe um número: "))
num2 = int(input("Informe um número: "))
if num1>=num2:
    list.append(num2)
    list.append(num1)
elif num1<=num2:
    list.append(num1)
    list.append(num2)
while True:
    x = int(input("Informe um número: "))
    for i in range(1,len(list)+1):
        if x<list[0]:
            list.insert(0,x)
            break
        elif x<list[i]:
            list.insert(i,x)
            break
        elif x>list[-1]:
            list.append(x)
            break
    continuar = str(input("Deseja continuar?? ")).upper()
    if continuar == "N":
        break
print(list)

