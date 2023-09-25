# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuacion
# elimine los elementos repetidos, por último mostrar la lista

# Creamos una lista
lista = [1, 2, 3, "Ariel", 7, 7, 3, "Alberto", 1, "Ariel", "Ariel", 2, "Alberto"]
print(lista)
#conjunto = set(lista)  # Convertimos la lista a un conjunto de tipo set
#print(conjunto)
#lista = list(conjunto)  # Convermimos el conjunto a una lista
lista = list(set(lista)) # La conversión hecha en una sola línea de código (eficiente)
print(lista)
