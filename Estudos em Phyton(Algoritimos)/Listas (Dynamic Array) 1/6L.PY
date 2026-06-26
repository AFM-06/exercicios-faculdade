x = str(input("Digite uma expressão matemática: ")).split()
if x.count("(") == x.count(")"):
    print("Essa expressão é valida!!!")
else:
    print("Expressão inválida. ")