nome = input("Qual seu nome? ")

idade = int(input("Qual sua idade? "))

altura = float(input("Qual sua altura? "))

estuda_programacao = input("Você estuda programação? (sim/não) ")

if estuda_programacao.lower() == "sim":
    estuda_programacao = True
else:
    estuda_programacao = False

print("\n===== CADASTRO =====")
print("Nome:", nome)
print("Idade:", idade)
print("Altura:", altura)
print("Estuda programação:", estuda_programacao)