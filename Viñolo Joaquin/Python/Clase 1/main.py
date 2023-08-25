# lista = Ariel, Liliana, Natalia, Osvaldo

nombres = ['Natalia', 'Ariel', 'Osvaldo', 'Lily']
print(nombres)
print(nombres[0:2]) #Solo muestra el indice 0, 1 pero no el indice 2
#ir del inicio de la lista al indice(sin incluirlo)
print(nombres [:3])
#Desde el indice indicado hasta el final
print(nombres[1:])
#Modificamos un valor
nombres[3] = 'Liliana'
nombres[0] = 'Natalia2'
print(nombres)

#Iterar una lista
for nombre in nombres: #nombre es singular, la lista es plural
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

#Preguntamos cuantos elementos tiene una lista
print(len(nombres)) #Le pasamos como parametro la lista

#Agregamos un elemento
nombres.append('Marcelo')
print(nombres)

#Insertar un elemento en un indice específico
nombres.insert(1, "Alberto Fernandez")
print(nombres)

#Eliminamos un elemento
nombres.remove('Marcelo')
print(nombres)

#Eliminar el último elemento
nombres.pop()
print(nombres)

#Eliminar un indice específico
del nombres[2]
print(nombres)

#Eliminar todos los elementos
nombres.clear()
print(nombres)

#Eliminar la lista
'''
del nombres
print(nombres)
'''

#Definimos una tupla
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

#Acceder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])
#Mostrar de manera inversa
print(cocina[-1])
#Acceder a un rango
print(cocina[0:2])
#Ejemplo
verduras = ('papa',) #Una tupla necesita aunque sea de un elemento: la coma

#Recorremos los elementos de la tupla
for cocinar in cocina: # Print esta usando /n saltos de línea
    print(cocinar,end = ' ') #Usamos end= para eliminar los saltos de línea

cocinaLista = list(cocina)
cocinaLista[0] = "Plato"
cocina = tuple(cocinaLista)
print(" "+cocina)