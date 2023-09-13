# *********** PARTE 1 **************
# Definimos un TUPLA
# Utilizamos paréntesis para definir una tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)

# Como saber la cantidad de elementos que contiene
print("Cantidad de elementos de la tupla cocina:")
print(len(cocina))

# Acceder a un elemento, para esto utilizamos corchetes
print("Conocer el elemento de indice 1")
print(cocina[1])

# Mostrar de manera inversa
print("Ver el último elemento de la tupla")
print(cocina[-1])

# Acceder a un rango de una tupla
print("Ver el rango 0 a 1 de la tupla:")
print(cocina[0:1])
# no se incluye el ultimo elemento del rango

# Ejemplo
verduras = ("papa",) # Una tupla necesita la coma, aunque sea solo un elemento,
# de lo contrario solo seria un tipo string o cadena

# *********** PARTE 2 **************

# Recorremos los elementos de la tupla
print("Recorremos los elementos de la tupla")
for cocinar in cocina:
    print(cocinar) # La funcion print se repute por cada ciclo for
    # Print está usando \n para saltos de linea

print("Eliminamos los saltos de linea")
for cocinar in cocina:
    print(cocinar, end=" ") #Usamos end= para eliminarlos saltos de linea

# Modificar una tupla
print("")
print("Modificando una tupla: ")
# Primero la debemos convertir a lista y modificamos el indice deseado
cocinaLista = list(cocina)
cocinaLista[0] = "Plato"
# Luego la convertimos en tupla de nuevo
cocina = tuple(cocinaLista)
print("\n", cocina)

# Eliminar una tupla
print("Eliminando una tupla: ")
del cocina  # (delete) eliminar una tupla
print(cocina) # Arrojará error porque la tupla ya no existe






