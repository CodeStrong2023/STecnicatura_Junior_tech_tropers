"""
Ejercicio 2: Modificar los elementos de una lista
Llenar una lista con los numeros del 1 al 10, luego modificar los
elementos de la lista multiplicandolos por un valor ingresado
por el usuario
"""
#  Segun yo
multiplicador = int(input("Ingrese un multiplicador: "))
lista = list(range(1*multiplicador, 11*multiplicador, multiplicador))
print(lista)

# Segun profe
lista = list(range(1,11))
for i in lista:
    print(i, end="-")
valor = int(input("\nIngrese un valor a multiplicar: "))
for indice, i in enumerate(lista):
    lista[indice] *= valor

print(f" Lista final con los elementos multiplicados por {valor}")
for i in lista:
    print(i, end="-")