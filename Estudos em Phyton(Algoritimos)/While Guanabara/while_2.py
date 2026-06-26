conte = 0
import random
x = random.randint(1,10)
y = -1
while y != x:
    conte+=1
    y = int(input("Tente adivinhar o número que pensei entre 1 e 10: "))
print("eu pensei no numero {}, e você precisou de {} tentativas para acertar.".format(x,conte))