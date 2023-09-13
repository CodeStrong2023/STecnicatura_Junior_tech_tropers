#Lista: Yamil, Franco, Nelson, Marianela, Joaquin, Mauro, Valentino

nombres = ["Yamil", "Franco", "Nelson", "Marianela", "Joaquin", "Mauro", "Valentino"]
print(nombres)

# Consultar cuantos elementos tiene nuestra lista
print("Consulta de cantidad de elementos: ")
print(len(nombres)) # Le pasamos como parámetro la lista

# Agregamos un elemento
print("Agregamos un elemento")
nombres.append("Marcelo")
print(nombres) # Efecto "Cola". Se agrega al final el nuevo elemento.

# Insertar un nuevo elemento en un índice específico
print("Insertamos en el índice 1, por ejemplo, la palabra Alberto")
nombres.insert(1,"Alberto")
print(nombres)
# El resto de los elementos se desplazan al final

# Agregar otro elemento
nombres.insert(3,"Debora")
print("Agregamos el elemento Debora en el indice 3")
print(nombres)

# Eliminar un elemento
nombres.remove("Alberto")
print("Eliminamos el elemento Alberto")
print(nombres)

# Eliminar el ultimo elemento
nombres.pop()
print("Eliminamos el ultimo elemento de la lista")
print(nombres)

# Eliminar un indice especifico
print("Eliminimamos el elemento del indice 2")
del nombres[2] # Del significa delete (eliminar)
print(nombres)

# Eliminar todos los elementos
print("Eliminamos todos los elementos")
nombres.clear()
print(nombres)

# Eliminar la lista
print("Eliminamos la lista")
del nombres
print(nombres) # Nos muestra error porque la lista ha sido eliminada