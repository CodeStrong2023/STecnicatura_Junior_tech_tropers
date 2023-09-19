import math # importamos la clase matemmatica para hacer uso de la funcion sqrt(raiz cuadrada)
# Ejercicio de tupla: Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8) # Definimos la tupla
"""
Crear una lista que solo incluya los numeros menores a 5
e imrpima por consola [1, 3, 2]
"""

lista = [] # Definimos una lista vacia
# Filtramos los elemenetos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(f"La nueva lista es: {lista}")

# Ejercicio de matematicas
# para sacar ña raiz cuadrada de un numero positivo
numero = int(input("Ingrese un numero positivo: "))
while numero < 0:
    print("Error, deberia ser un numero positivo")
    numero = int(input("Ingrese un numero positivo: "))
print(f"Su raiz cuadrada es: {math.sqrt(numero):.2f}")