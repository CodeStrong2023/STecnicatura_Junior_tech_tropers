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

#SET no tiene orden, no permite el almacenamiento de elem duplicados o repetidos,
#no se puede modificar, si se puede agregar o eliminar, órden aleatorio, sin índices.

#tipo set {}
planetas = {'Marte', 'Júpiter', 'Venus'}
print(len(planetas))#len para mostrar el lago
#Saber si un elemento está dentro de set
print('Júpiter' not in planetas) #tipo bool(respetar sintáxis)

#Agregar elemento: .add()
planetas.add('Tierra')
#planetas.add('Tierra') no agrega duplicados no muestra ningún cambio
print(planetas)
#set nos permite evitar duplicados en una lista

#Eliminat elementos: .remove()
planetas.remove('Marte')
print(planetas)
planetas.discard('Tierra')# .discard no muestra error pero si esta mal escrito el elem no se va a eliminar
print(planetas)
planetas.discard('venus')

#Limpiar set o conjunto
planetas.clear()
print(planetas)
#Eliminar
#del planetas
#print(planetas)

#DICCIONARIOS:´{} compuesto por dos elementos ejemplo: 'Maradona':10
#                                                         llave  valor asociado
diccionario = {
    'IDE':'Integrated Development Environment',
    'POO':'Programación Orientada a Objetos',
    'SABD':'Sistema de Administración de Base de Datos'
}
print(diccionario)

#Ver el largo de los elem
print(len(diccionario))

#Acceder a un elemento desde la llave(key)
print(diccionario['IDE'])

#Recuperar elemento otra forma:  .get+key
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

#Modificar elementos:
diccionario['IDE']= 'Entorno de Desarrollo Integrado'
print(diccionario)

#Recorrer elementos con "for" sólo accediendo a las llaves
for termino in diccionario:
    print(termino)
#FUNCION PARA RECORRER DICCIONARIO .items()
for termino, valor in diccionario.items():
    print(termino, valor)

#Otras maneras de acceder a un diccionario:
for termino in diccionario.keys(): # Muestra sólo las llaves
    print(termino)
for termino in diccionario.values(): #Muestra solo los valores de las keys
    print(termino)

#Ver si existe un elemento
print('IDE' in diccionario)

#Agregar elemento:
diccionario['PK'] = 'Primary Key'
print(diccionario)

#Eliminat elemento .pop
diccionario.pop('SABD')
print(diccionario)

#Vaciar diccionario
diccionario.clear()
print(diccionario)

#Eliminat diccionario
#del diccionario
#print(diccionario)

#Concatenar listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1+lista2
print(lista3)

#Funcion .extend() para agregar varios elem a una lista
lista3.extend([7, 8, 9])
print(lista3)

#Para saber en que indice esta un elem: .index()
#print(lista3.index(5))

#Para saber cuántos valores repetidos hay en una lista: .count()
print(lista3.count(1))

#Para poner lista al revés: .reverse()
lista3.reverse()
print(lista3)

#Para que una lista se multiplique repitiendo sus elementos:
lista3 = lista3 * 2
print(lista3)

#Métodos de ordenamiento_: .sort() los va a ordenar de manera ascendente por default
lista3.sort()
print(lista3)
#MANERA DESCENDENTE:
lista3.sort(reverse=True)
print(lista3)

#REPASO DE TUPLAS:
tupla = (4, 'Hola', 6.78, [1, 2, 3], 4, 'Hola')
print(tupla)

print(4 in tupla)