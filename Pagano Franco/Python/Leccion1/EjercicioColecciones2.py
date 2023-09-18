"""
Ejercicio 2: Operaciones de conjuntos con listas
Escriba un programa que tenga 2 listas y que a continuacion
cree las siguientes listas (en las que no deben haber repetidos)
1- Lista de palabras que aparecen en las listas
2- Lista de palabras que aparecen en la primera lista, pero no en la segunda
3- Lista de palabras que aparecen en la segunda lista, peor no en la primera
4- Lista de palabras que aparecen en ambas listas
"""

lista1 = ["A", "B", "C", "D"]
lista2 = ["C", "D", "E", "F"]

#  Lista de palabras que aparecen en las listas
union = list(set(lista1) | set(lista2))
print(f"Palabras que aparecen en las listas: {union}")

#  Lista de palabras que aparecen en la primera lista, pero no en la segunda
soloLista1 = list(set(lista1) - set(lista2))
print(f"Elementos de la lista1 que no pertenecen a la lista2: {soloLista1}")

#  Lista de palabras que aparecen en la segunda lista, peor no en la primera
soloLista2 = list(set(lista2) - set(lista1))
print(f"Elementos de la lista2 que no aparecen en la lista1: {soloLista2}")

#  Lista de palabras que aparecen en ambas listas
Interseccion = list(set(lista1) & set(lista2))
print()