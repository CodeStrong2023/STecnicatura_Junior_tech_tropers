# Repaso de set o conjunto
# para definir un conjunto
conjunto = set()
conjunto1 = {"bye", }
conjunto.add(7)
conjunto.add("Hola")
print(conjunto)

conjunto1.add("Hola")
print(conjunto1)
print(3 not in conjunto1)  # Pregutamos si el número 3 "NO" esta en el conjunto1

# Como hacer la igualdad de dos conjuntos
print(conjunto == conjunto1)  # Nos devuelve como respuesta un booleano

# Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto  # La línea une los 2 conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto # Que elelemtos tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto # Ver los conjuntos que solo estan en el conjunto 1 y no estan en el conjunto
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto # Son los elementos que estan en los 2 conjuntos pero no estan compartidos
print(conjunto3)

