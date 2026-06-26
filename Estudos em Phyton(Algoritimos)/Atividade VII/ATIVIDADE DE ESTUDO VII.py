def adicionar(tupla):
    dicionario = {tupla[0]: [tupla[1], tupla[2]]}
    lista.append(dicionario)
def listar(txt):
    if not lista:  # Se a lista estiver vazia
        print("\nSua lista de contatos está vazia.\nAdicione contatos para vê-los aqui.\n")
    else:
        print("\nContatos:")
        # Extrair todas as chaves e ordenar alfabeticamente
        chaves = sorted([list(dicionario.keys())[0] for dicionario in lista if dicionario])
        for chave in chaves:
            print(chave)
        print()
def excluir():
    listar(lista)
    excluir = str(input("Qual contato deseja excluir?\n"))
    contido = any(excluir in dicionario for dicionario in lista)
    if contido:
        for dicionario in lista:
            if excluir in dicionario:
                lista.remove(dicionario)
                break  # Adicionado break para sair do loop após encontrar e remover o dicionário
    else:
        print("Erro, o contato selecionado não está na sua lista.")
def atualizar():
    listar(lista)
    chave_antiga = str(input("Qual contato deseja atualizar?\n"))
    nova_chave = str(input("Novo nome para o contato: "))
    novo_telefone = str(input("Novo número de telefone: +55 "))
    novo_email = str(input("Novo email: "))

    contato_encontrado = False
    for dicionario in lista:
        if chave_antiga in dicionario:
            # Armazenar os valores associados à chave antiga
            valores = dicionario[chave_antiga]
            # Remover a chave antiga
            del dicionario[chave_antiga]
            # Adicionar a nova chave com os novos valores
            dicionario[nova_chave] = [novo_telefone, novo_email]
            contato_encontrado = True
            break

    if not contato_encontrado:
        print("Erro, o contato selecionado não está na sua lista.")
def buscar():
    if not lista:  # Se a lista estiver vazia
        print("\nSua lista de contatos está vazia.\nAdicione contatos para vê-los aqui.\n")
        return

    nome_procurado = str(input("Digite o nome do contato que deseja buscar: "))
    contato_encontrado = False

    for dicionario in lista:
        if nome_procurado in dicionario:
            contato_encontrado = True
            valores = dicionario[nome_procurado]
            telefone = valores[0]
            email = valores[1]
            print(f"\nContato encontrado:\nNome: {nome_procurado}\nNúmero: +55 {telefone}\nEmail: {email}\n")
            break

    if not contato_encontrado:
        print("Erro, o contato selecionado não está na sua lista.")
print("                Contatos\n")
lista = []
while True:
    realizar = int(input("[1]Adicionar contato.   [2]Listar contatos.\n[3]Atualizar contato.   [4]Excluir contato.\n[5]Buscar contato.      [6]Sair.\n"))
    if realizar == 6:  # SAIR
        break
    elif realizar == 1:  # Adicionar contato
        tupla = str(input("Nome para contato: ")), str(input("Número de Telefone: +55 ")), str(input("Email: "))
        adicionar(tupla)
    elif realizar == 2:  # Listar contatos
        listar(lista)
    elif realizar == 3:  # Atualizar contato
        atualizar()
    elif realizar == 4:  # Excluir contato
        excluir()
    elif realizar == 5:  # Buscar contato
        buscar()
print("Até mais.")