#Ejercicio 4: Juego de adivina el número
#Realizar un juego para adivinar el número. Para ellos se debe
#generar un número aleatorio entre 1 - 100, y luego ir pidiendo
#números indicando "es mayor" o "es menor" según sea mayor o menor
#con respecto a N. El proceso termina cuando el usuario acierta
#y allí se debe mostrar el número de intentos.

import random
print("ESTE ES EL GAME ADIVINA EL NÚMERO")
aleatorio = random.randint(0, 100) #Toma de 0 a 100, generamos un número aleatorio
contador = 0

while True:
    numero = int(input("Digite un número: "))
    contador +1
    if numero > aleatorio:
        print("No es el número 💣, digite un número menor")
    elif numero < aleatorio:
        print("No es el número 👓, digite un número mayor")
    else:
        print(f"✨🎉🎉🎉✨ Felicitaciones el número {numero} es el correcto ✨🎉🎉🎉✨")
        break #Terminamos el ciclo y el bucle

print(f"Número de intentos: {contador}")