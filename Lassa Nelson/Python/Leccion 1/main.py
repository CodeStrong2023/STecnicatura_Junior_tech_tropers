# lista = Nelson, Mariano, Valentin, Jose
nombres = ["Nelson", "Mariano", "Valentin", "Jose"]

print(nombres)  # imrpimira lista completa
"""
print(nombres[0]) imprimira solo el primer conjunto
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])
"""
print(nombres[0:2])  # el intervalo a mostrar es del 0 al 2 pero no incluye el 2
print(nombres[:3])  # muestra del inicio sin incluir el valor 3
print(nombres[1:])  # muestra del valor 1 hasta el ultimo

# Modificamos un valor

nombres[3] = "Papá"
print(nombres)

# Iterar una lista
for i in nombres:  # nombre es singular, la lista esta en plurarl
    print(i)
else:
    print("Se acabaron los elementos de la lista")

# Preguntamos cuantos elementos tiene la lista
print(len(nombres))  # pasamos como parametro la lista

# Agregamos un elemento
nombres.append("Sofi")
print(nombres)

# Agregamos un elemento en un indice especifico
nombres.insert(4, "Daniela")
print(nombres)
nombres.insert(3, "Ezequiel")
print(nombres)

# Eliminamos un elemento
nombres.remove("Ezequiel")
print(nombres)

# Eliminar el ultimo elemnto
nombres.pop()
print(nombres)

# Eliminar un indice especifico
del nombres[1]  # del significa delete (eliminar)
print(nombres)

# Eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)  # borra el contenido

# Eliminar lista
del nombres
"""
print(nombres) # este borra la variable nombre
"""

# Definimos una tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)
# Obtenemos la cantidad de elementos que la contienen
print(len(cocina))

# Acceder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])

# mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango
print(cocina[0:2])

# Ejemplo
verdura = ("papa",)  # Una tupla necesita aunque sea un elemento la coma

# Recorremos los elemtos de la tupla

for cocinar in cocina:
    print(cocinar)  # de forma vertical con salto de linea \n  -> alt+92 para salto de linea
for cocinar in cocina:
    print(cocinar, end=" ")  # de forma horizontal o en una misma linea

cocinaLista = list(cocina)
cocinaLista[0] = "plato"
cocina = tuple(cocinaLista)
print("\n", cocina)

# del cocina
# esto se utiliza para eliminar la tupla
