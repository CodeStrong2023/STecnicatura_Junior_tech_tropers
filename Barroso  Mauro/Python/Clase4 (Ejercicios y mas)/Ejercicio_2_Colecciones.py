#Ejercicio2: Operaciones de conjuntos con listas
#Escribir un programa que tenga 2 listas y que a continuación cree las stes listas:
#1 Lista de palabras que aparecen en laslistas
#2 Lista de palabras que aparecen en la primera pero no en la seguda
#3 lista de palabras que aparecen en la segunda pero no en la primera
#4 Lista de palabras que aparecen en ambas listas

lista1 = [1, 2, 3, "Emir", "Sahir", 4, 5, 6, 5, 12, 13, 12, "Emir"]
lista2 = [2, 4, 6, "Sahir", 8, 10, 12, "Sebastián", 13]
conjunto = set(lista1)
conjunto2 = set(lista2)

lista3 = list(conjunto | conjunto2)
conj1 = list(conjunto - conjunto2)
conj2 = list(conjunto2 - conjunto)
ambas = list(conjunto & conjunto2)
print(f"1: Lista de palabras que aparecen en las listas: {lista3}")
print(f"Lista de palabras que aparecen en la primera pero no en la segunda: {conj1}")
print(f"Lista de palabras que aparecen en la segunda pero no en la primera: {conj2}")
print(f"Lista de palabras que aparecen en ambas listas: {ambas}")