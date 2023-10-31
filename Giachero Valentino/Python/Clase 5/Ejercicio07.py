#Ejercicio 7:Juega a adivinar el número
#Realizar un juego para adivinar un número-Para ello se debe generar
#un número alea entre 1 y 100, y luego ir pidiendo números indicande
#"es mayor" o " es menor" segun sea, con respecto a N. El proceso termina cuando
#el usuario acierta al número y se debe mostrar la cantidad de intentos
import random
alea = random.randint(0, 100) #función para generar número aleatorio de 0 a 100
contador = 0
while True:
    numero = int(input('Ingrese un número: '))
    contador += 1
    if numero < alea:
        print("\tNo has acertado, ingresa un número mayor: ")
    elif numero > alea:
        print("\tNo has acertado, ingresa un número menor: ")
    else:
        print(f"\tFELICITACIONES!! Acertaste el número {numero} en {contador} intentos!")


