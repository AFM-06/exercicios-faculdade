while True:
    print("\n")
    x = int(input("Quer saber a tabuada de qual numero? "))
    if x<0:
        print("Programa encerrado.")
        break
    for i in range (1,11):
        print(f" {x}x{i} = {x*i} ",end = " ")