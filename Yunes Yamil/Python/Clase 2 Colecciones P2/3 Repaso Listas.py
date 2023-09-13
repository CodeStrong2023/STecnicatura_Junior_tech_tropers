# Las listas, conjuntos, tuplas y diccionarios pertenecen a conjuntos en Python
# Las listas se conocen en otros lenguajes como arreglos o vectores

nombres = ['Yamil', 'Jesus', 'Yunes']

# Agregamos elementos de diferentes tipos
# Una lista puede tener diferentes tipos de datos
print("*** Agregando otros tipos de valores a la lista ***")
nombres.append('Marcelo') # Dentro de una lista pueden haber diferentes tipos de datos
nombres.append([1,2,3]) # Dentro de una lista, puede haber otra lista
nombres.append(True) # Pueden haber datos de tipo booleano
nombres.append(10.45) # Pueden haber valores tipo float
print(nombres)



# Concatenamos listas
print("*** Concatenando listas: ***")
lista1 = [1,2,3]
lista2 = [4,5,6]
lista3 = lista1 + lista2
print(lista3)

# Funcion extend
# Es para agregar varios elementos a una lista
print("*** Agregar varios elementos a la lista ***")
lista3.extend([7,8,9])
print(lista3)

# Funcion index
# Para saber en que indice esta un elemento
print("*** En qué indice se encuentra el numero 5")
print(lista3.index(5)) # Ingresamos el elemento y nos dará el indice

print("*** Ingresando un elemento que no está en la lista ***")
# print(lista3.index(0)) # Arrojará error porque no se encuentra el elemento en la lista

# Contar valores repetidos en una lista
print("*** Contar repetidos en lista ***")
print(lista3.count(1))

# Para invertir la lista
print("*** Invirtiendo la lista *** ")
lista3.reverse() # Se invierte el orden de la lista
print(lista3)

# Multiplicar una lista repitiendo sus elementos
print("*** Multiplicar lista y repetir elementos ***")
lista3 = lista3 * 2
print(lista3)

# Métodos de ordenamiento
# Orden ascendente
print("*** Funcion Sort - Orden Ascendente ***")
lista3.sort()
print(lista3)

# Orden descendente
print("*** Funcion Sort Invertida - Orden Descendente ***")
lista3.sort(reverse=True)
print(lista3)










