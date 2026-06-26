frase = input("Frase: ")
palavras = frase.split()
palavras_filtradas = [palavras for palavras in palavras if len(palavras)>3]
print("Palavras com mais de três letras: {}".format(', '.join(palavras_filtradas)))