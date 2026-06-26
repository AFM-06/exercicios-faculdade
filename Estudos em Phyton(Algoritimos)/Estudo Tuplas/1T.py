extenso = ("Zero", "Um", "Dois", "Tres", "Quatro", "Cinco","Seis","Sete","Oito","Nove","Dez","Onze","Doze","Treze","Catorze","Quinze","Dezesseis","Dezessete","Dezoito","Dezenove","Vinte")
num = int(input("Me informe um número: "))
while True:
    if num<0 or num>20:
      print("Informe um valor de 0 a 20")
      num = int(input("Me informe um número: ")) 
    if 21>num>0 :
        print(f"O número digitado foi {extenso[num]}.")
        break