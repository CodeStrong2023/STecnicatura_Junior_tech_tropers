"""
Ejercicio 7: Juego adivina el número
Realiza un juego para adivinar un número. Para ellos
se debe generar un número aleatorio entr 1 - 100 y luego ir
pidiendo números indicando "es mayor" o "es menor" segun sea
mayor o menor con respecto a N. El proceso termina cuando el
usuario acierta y alli se debe mostrar el numeor de intentos.
"""
import random
print("¡JUEGO DE ADIVINANZA!")
numeroSecreto = random.randint(0,100) # Generamos un numero aleatorio entre 1 a 100
numero = int(input("Ingrese un numero: "))
contador = 0
while numero != numeroSecreto:
    contador +=1
    if numero > numeroSecreto:
        numero = int(input("Ingrese un numero menor: "))
    else:
        numero = int(input("Ingrese un numero mayor: "))

print(f"FELICIDADES EL NUMERO SECRETO ES: {numeroSecreto}")
print(f"Con una cantidad de {contador} intentos")