# Ejercicio 7: Juego adivina el numero
# Realizar un juego para adivinar un numero. Para ello se debe
# generar un numero aleatorio entre 1 - 100, y luego ir pidiendo
# numeros indicando "es mayor" o "es menor" segun sea mayor o menos
# con respecto a N. El proceso termina cuando el usuario acierta
# y alli se debe mostrar el numero de intentos.

import random
print("\tJuego Adivina el número: ")
aleatorio = random.randint(0,100) # Toma de 0 a 100 literal
contador = 0
while True:
    numero = int(input("Digite un numero: "))
    contador += 1
    if numero > aleatorio:
        print("\tNo es el numero, digite un numero menor. ")
    elif numero < aleatorio:
        print("\tNo es el numero, digite un numero mayor.")
    else:
        print(f"\tFelicidades, acabas de encontrar el numero {aleatorio}")
        break # Rompe el ciclo y el bucle

print(f"\nNúmero de intentos: {contador}")

