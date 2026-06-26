um = int(input("Qual o primeiro termo: "))
dois = int(input("Qual o segundo termo: "))
termos = um * 2
if um % 2 == 0:
    for i in range (dois,dois+termos):
        if i % 2 == 0:
            print(i)
if um % 2 != 0:
    for i in range (dois,dois+termos):
        if i % 2 !=0:
            print(i)