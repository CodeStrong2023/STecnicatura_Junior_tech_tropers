# Ejercicio 7:  Juego adivina el número
# Realiza un juego para adivinar un número. Para ello se debe
# generar un número aleatorio entre 1-100, y luego ir pidiendo
# números indicando "es mayor" o " es menor" según sea mayor o menor
# con respecto a N. El proceso termina cuando el usuario acierta
# y alli se debe mostrar el número de intentos.
import random

intentos = 0
numeroIncognita = random.randint(1, 100)
while True:
    numeroIngresado = int(input("Encuentra el numero aleatorio entre 1-100: "))
    intentos += 1
    if numeroIngresado> numeroIncognita:
        print("\tNo es el número -> El número es menor!!!")
    elif numeroIngresado< numeroIncognita:
        print("\tNo es el número -> El número es mayor!!!")
    else:
        print(f"FELICIDADES, acabas de adivinar el número {numeroIncognita}")
        break # Rompe el ciclo y el bucle
print(f"\nNúmero de intentos: {intentos}")