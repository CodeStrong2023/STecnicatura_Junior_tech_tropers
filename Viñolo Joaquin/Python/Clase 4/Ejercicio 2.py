#Ejercicio 2: Operaciones de conjuntos con listas
#Escriba un programa que tenga 2 listas y que a continuación
#cree las siguientes listas (en las que no deben haber repetición)
#1 Lista de palabras que aparecen en las listas
#2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
#3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
#4 Lista de palabras que aparecen en ambas listas

lista1 = [1,2,3,4,4,5,6,7,7,8]
lista2 = [2,6,7,8,9,10,11,12,13]

#Eliminamos los elementos repetidos de ambas listas con conjuntos
conjunto1 = set(lista1)
conjunto2 = set(lista2)

#Unimos ambas listas
union = list(conjunto1 | conjunto2) #Unimos los dos conjuntos
#Solo la primer lista
solo1 = list(conjunto1 - conjunto2) #Solo muestra el conjunto1
#Solo la segunda lista
solo2 = list(conjunto2 - conjunto1) #Solo muestra el conjunto2
interseccion = list(conjunto1 & conjunto2) #Mostramos ambas listas

#Imprimimos en consola
print(f"Lista de palabras que aparecen en las listas: {union}")
print(f"Lista de palabras que aparecen en la primer lista, pero no en la segunda: {solo1}")
print(f"Lista de palabras que aparecen en la segunda lista, pero no en la primera: {solo2}")
print(f"Lista de palabras que aparecen en ambas listas: {interseccion}")