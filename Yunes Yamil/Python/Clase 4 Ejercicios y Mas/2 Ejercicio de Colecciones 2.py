# *** EJERCICIO DE COLECCIONES 2 ***
# Ejercicio 2: Operaciones de conjuntos con listas
# Cree las siguientes listas (en las que no debe haber repetición)
# 1 Lista de palabras que aparecen las listas
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 Lista de palabras que aparecen en ambas listas

print('*** Listas iniciales: ')
lista1 = [1,2,3,3,3,4,5,5,6,7,7,8,9,9,9]
lista2 = [1,1,1,3,3,5,7,7,9]
print(lista1)
print(lista2)

# Para realizar las operaciones, convertimos las listas a conjuntos:
print('*** Convertimos a conjunto las listas y eliminamos repetidos: ')
conjunto1 = set(lista1)
conjunto2 = set(lista2)

print('*** Nuestros conjuntos ahora son:')
print(conjunto1)
print(conjunto2)


# 1 Lista de palabras que aparecen en las listas
print('*** Lista de palabras que aparecen en lista1 y lista2')
union = list(set(conjunto1|conjunto2))
print(union)

# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
print('*** Lista de palabras que aparecen en la primera lista, pero no en la segunda: ')
solo1 = list(conjunto1 - conjunto2) # Hacemos la diferencia entre los conjuntos
print(solo1)

# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
print('*** Lista de palabras que aparecen en la segunda lista, pero no en la primera: ')
solo2 = list(conjunto2 - conjunto1)
print(solo2)

# 4 Lista de palabras que aparecen en ambas listas
print('*** Lista de palabras que aparecen en ambas listas: ')
ambas = list(conjunto1 & conjunto2)
print(ambas)