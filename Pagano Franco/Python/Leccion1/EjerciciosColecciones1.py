"""
Ejercicio 1: Eliminar duplicados de una lista
Escribir un programa donde tenga una lista y que a continuación
elimine los elementos repetidos, por último mostrar la lista
"""
lista = ["A", "B", "B", "C", "A", "D", "C"]  # Creamos una lista
conjunto = set(lista)  # La convertimos para eliminar los elementos repetidos
print(conjunto)  # Observamos los elementos eliminados
lista = list(conjunto)
print(lista)  # Ahora podemos identificar los elementos en una lista

# De forna reducida en un solo codigo
print(list(set(lista)))