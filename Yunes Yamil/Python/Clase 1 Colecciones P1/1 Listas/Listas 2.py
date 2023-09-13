#Lista: Yamil, Franco, Nelson, Marianela, Joaquin, Mauro, Valentino

nombres = ["Yamil", "Franco", "Nelson", "Marianela", "Joaquin", "Mauro", "Valentino"]
print(nombres)

# Recuperar un rango de la lista. Por ejemplo, del índice 0 al 2:
print("Recuperar el rango 0:2 de la lista:")
print(nombres[0:2]) # No incluye el índice 2

# Ir desde el inicio de la lista hasta el indice (sin incluirlo)
print("Desde el inicio de la lista hasta el indice 3")
print(nombres[ :3]) # Indices a mostrar: 0,1,2

# Desde el indice indicado hasta el final
print("Desde el indice 1 hasta el final")
print(nombres[1: ])

# Modificamos el valor
nombres[2] = "Nelson Lassa"
print(nombres)

# Iterar nuestra lista
print("Iteración de nuestra lista: ")
for nombre in nombres: # nombre es singular, la lista es plural
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")




