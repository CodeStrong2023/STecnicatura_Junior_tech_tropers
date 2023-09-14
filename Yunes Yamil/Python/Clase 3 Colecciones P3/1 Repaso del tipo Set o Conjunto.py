# *** REPASO DEL TIPO SET O CONJUNTO ***

# Para definir un conjunto

conjunto2 = set()
conjunto1 = {'bye',} # Debe tener al menos 1 dato y una coma
conjunto2.add(7) # Solo se puede ingresar de a uno a la vez
conjunto2.add('Hola')
print('** Conjunto 2:')
print(conjunto2)


conjunto1.add('hola')
print('** Conjunto 1:')
print(conjunto1)

print('*** ¿El num 3 NO está en el conjunto1? ***')
print(3 not in conjunto1) #Preguntamos si el numero 3 NO está en el conjunto 1
# Se recibe respuesta booleana

# Como hacer igualdad de conjuntos
print('*** ¿El conjunto1 es igual al conjunto2? ***')
print(conjunto1 == conjunto2)
# Se recibe respuesta booleana

# *** Operaciones en conjuntos ***
conjunto3 = conjunto1 | conjunto2   # La linea une los dos conjuntos
print('** Conjunto 3:')
print(conjunto3)

# Interseccion
conjunto3 = conjunto1 & conjunto2 #Qué elementos tienen en comun
print('Intersección: ')
print(conjunto3)

# Diferencia (Elementos del conjunto 1 que no estan en el conjunto 2)
conjunto3 = conjunto1 - conjunto2
print('** Elementos del c1 que no estan en el c2')
print(conjunto3)

# Diferencia (Elementos del conjunto 2 que no estan en el conjunto 1)
conjunto3 = conjunto2 - conjunto1
print('** Elementos del c2 que no estan en el c1')
print(conjunto3)

# Diferencia simétrica
conjunto3 = conjunto1 ^ conjunto2 # Elementos que no comparten ambos conjuntos
print('Diferencia Simétrica (^)')
print(conjunto3)

# Subconjuntos
print('*** Si el conjunto 3, esta compuesto por el conjunto 1 y el 2,')
print('*** ¿Es el conjunto1 subconjunto del conjunto3?')
conjunto3 = conjunto1 | conjunto2
print(conjunto1.issubset(conjunto3)) #Preguntamos si un conjunto es subconjunto de otro

print('*** ¿Es el conjunto2 subconjunto del conjunto3?')
print(conjunto2.issubset(conjunto3))

print('*** ¿Es el conjunto3 subconjunto del conjunto1?')
print(conjunto3.issubset(conjunto1))

print('*** ¿Es el conjunto3 subconjunto del conjunto2?')
print(conjunto3.issubset(conjunto2))

# Superconjuntos

print('--- Es el c3 superconjunto del c1?')
print(conjunto3.issuperset(conjunto1)) # Preguntamos si los elementos del c3 e1 estan dentro del c3
print('--- Es el c3 superconjunto del c2?')
print(conjunto3.issuperset(conjunto2))
print('--- Es el c2 superconjunto del c3?')
print(conjunto2.issuperset(conjunto3))

# Conjuntos disconexos
print('--- ¿El conjunto1 y el conjunto2 son disconexos?')
print(conjunto1.isdisjoint(conjunto2)) # No hay cosas en comun

# Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset # Esto hace que el conjunto sea totalemente inmutable
# No se puede agregar, modificar o eliminar elementos del conjunto
