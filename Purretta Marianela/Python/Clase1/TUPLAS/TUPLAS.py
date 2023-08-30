#DEFINIMOS UNA TUPLA
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(cocina)

#saber el largo de una tupla con len
print(len(cocina))

#Acceder a un elemento se usan [] no ()
print(cocina[0])
print(cocina[-2])

#Acceder a un rango
print(cocina[0:2])
#Las tuplas necesitan si o si una coma (,) para que sea tupla y no str

#Recorrer elementos de la tupla
for cocinar in cocina:
    print(cocinar, end=' ') #print lo muestra con salto de línea, para sacarlos con end=' '
#cocina[0] = 'plato' (de esta forma no se pueden agregar elementos como en las listas)
#Pra poder modificarla pasamos de tupla a lista, modificamos y luego convertimos de nuevo a tupla ej:
cocinaLista = list(cocina) #conversion a lista
cocinaLista[0] = 'Plato' #modificacion
cocina = tuple(cocinaLista) #conversion a tupla
print('\n', cocina)

#para eliminar una tupla
#del cocina


