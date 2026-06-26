senha = "A5cZJ291PQde"
login = "247mMpOlF5TQ"
loop = -1
while (loop != 0):
    perguntar_senha = input("Senha: ")
    perguntar_login = input("Login: ")
    if perguntar_login != login or perguntar_senha != senha:
        print("Senha ou Login inválidos.")
        print("Tente novamente.")
    if perguntar_senha == senha and perguntar_login == login:
        print("Bem vindo !!! ")
        loop = 0