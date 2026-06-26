#compatível com Gmail,Yahoo,Outlook,Hotmail,Aol e Icloud(e com subdominio.outlook.com,@subdominio.hotmail.com,@subdominio.aol.com e @subdominio.yahoo.com).
def verf_email(email):
    caracteres_invalidos = ["+","/","%","º","ª","!","?","*","$","#","^","<",">","~","´","´","]","[","(",")","{","}","|","\\","&","=","-","`"]
    caracteres_invalidos_in_verificar0 = [".","-","+","$","&","*","_","!","'","~","=",";","/","?","^","(",")","[","]","%","\\","@","#"] 
    if not email:
        print("Email inválido.")
    else:
        numero_de_caracteres = len(email)
        verificar = email.strip()
        if numero_de_caracteres<8:
            print("Email inválido.")
        else:
            if "@" in verificar: # se tem "@" no email:
                arroba =verificar.count("@") #contando quantos @ tem na String
                if verificar[0] in caracteres_invalidos_in_verificar0: #verifica se é no primeiro digito.(logo,inválido.)
                    print("Email inválido.")
                elif arroba>1: #não pode ter mais de 1 arroba na String(logo,inválido.)
                    print("Email inválido.")
                else:                # V  aqui embaixo ta vereficando se termina com algum domínio compatível com a função.
                    if verificar.endswith("@gmail.com") or verificar.endswith("@yahoo.com") or verificar.endswith("@outlook.com") or verificar.endswith("@hotmail.com") or verificar.endswith("@aol.com") or verificar.endswith("@icloud.com") or verificar.endswith("@subdominio.outlook.com") or verificar.endswith("@subdominio.hotmail.com") or verificar.endswith("@subdominio.aol.com") or verificar.endswith("@subdominio.yahoo.com"): #verificar se depois do @ tem algum domínio válido.
                        conte = 0 #um contador para auxiliar na verificação de caracteres inválidos.
                        for i in verificar: #verifica letra por letra em busca de uma invalidação.
                            if i in caracteres_invalidos:
                                conte+=1
                        while True:
                            if conte == 0: #se não tiver nenhum caractere inválido, ele vai buscar se existe caracteres especiais mas usados de maneira inválida.
                                parte_local, parte_dominio = email.split("@") #Divide o email em antes e depois do @, usando isso é possivel verificar se antes do domínio existe a repetição de caracteres especiais válidos.(mas, usados de forma inválida.)
                                if '..' in parte_local or '--' in parte_local or '++' in parte_local or '$$' in parte_local or '&&' in parte_local or '**' in parte_local or '__' in parte_local or '!!' in parte_local or "''" in parte_local or '~~' in parte_local or '==' in parte_local or ';;' in parte_local or '//' in parte_local or '??' in parte_local or '^^' in parte_local or '((' in parte_local or '))' in parte_local or "[[" in parte_local or ']]' in parte_local or '%%' in parte_local or '\\' in parte_local :
                                    print("Email inválido.")
                                else:
                                    verificacao_final_de_caracteres_maximo = len(parte_local) #verifica se a parte local é maior que 64 (se for, logo, inválido.)
                                    if verificacao_final_de_caracteres_maximo > 64:
                                        print("Email inválido.")
                                        break
                                    else:
                                        return print("Email válido.")
                                        break
                                break
                            else: #inválido.
                                print("Email inválido.")
                                break   
                    else:
                        print("Email inválido.")
            else:
                print("Email inválido.")
x = str(input(".\n"))
verf_email(x)
