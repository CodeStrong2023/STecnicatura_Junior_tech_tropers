# LISTAS: Sebastian, Emir, Sahir, 34, 54
# las listas pueden tener diferentes tipos de datos
lista1 = ['Sebastian', 'Emir', 'Sahir', 34, 54]
# Imprimimos lista completa
print(lista1)
# para recorrer desde una posicion hasta otra
print(lista1[0:3])
# ir desde inicio a indice sin mostrarlo
print(lista1[:3])
# ahora indicamos desde indice indicado hasta el final
print(lista1[1:])
# modificar el valor
lista1[3] = 'Emir'
lista1[1] = 'Marianela'
print(lista1)
# Iterar una lista
for nombre in lista1:
    print(nombre)
else:
    print('Se acabaron los elementos de ')

# PREGUSTAR CANTIDAD DE ELEMENTOS
print(len(lista1))
# Agregar elementos con nombre de lista + . para acceder a appennd(ej: ('lucia')
lista1.append('Lucía')
lista1.append([1, 2, 3])
lista1.append(True)
lista1.append(10.12)
lista1.append([4, 5])
lista1.append(4)
print(lista1)
# se ingresa al final como una fila o cola

# Agregar elemento en índice indicado con . + insert+(indice)(posicion) , 'elem')
lista1.insert(1, 'Ana')
print(lista1)
lista1.insert(3, 'Sira')
print(lista1)

# Eliminar elemento . remove
lista1.remove('Sira')
print(lista1)
# Eliminar ultimo elemento (posicion)
lista1.pop()
print(lista1)
# Eliminar elem específico
del lista1[2]
print(lista1)
# Eliminar todos los elementos
lista1.clear()
print(lista1)

# ELIMINAR LISTA
#del lista1
#print(lista1)
