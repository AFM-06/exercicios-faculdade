total_de_alunos = 0
nota = 0
nota_geral = 0
nota_maior = 0
disciplinas_geral = 0
while(nota!=-1):
    nota = float(input("Informe uma nota [digite: -1 para sair]: "))
    if(nota!=-1):
            num_disciplinas = int(input("Informe o número de disciplinas: "))
            nota_geral += nota
            disciplinas_geral += num_disciplinas
            total_de_alunos += 1
    if nota > nota_maior:
            nota_maior = nota
if total_de_alunos > 0:
    media_notas = nota_geral / total_de_alunos
    media_disciplinas = disciplinas_geral / total_de_alunos
print(f"Média geral das notas> {media_notas:.2f}")
print(f"Média geral das disciplinas: {media_disciplinas:.2f}")
print(f"Maior nota: {nota_maior:.2f}")