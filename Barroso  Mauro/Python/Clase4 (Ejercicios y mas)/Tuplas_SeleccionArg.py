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

#CLASE3
#Los conjuntos son grupos de elementos desordenados, NO PUEDEN TENER DUPLICADS.
#Para definir un conjunto:
conjunto2 = set()
#cuando se inicia con llaves debe tener dentro algún elemento
conjunto1 = {'bye', }
#Añadir elementos a conjunto con .add() de a uno, no se puede de varios
conjunto2.add(7)
conjunto2.add('Hola')
print(conjunto2)
conjunto1.add('hola')
print(conjunto1)
print(3 not in conjunto1)#Preguntar si un elemento está en el conjunto (T O F)

#Como hacer la igualdad de dos conjuntos
print(conjunto2 == conjunto1)

#Operaciones en conjuntos:
#Union de conjuntos
conjunto3 = conjunto1 | conjunto2 #con "|" unimos los conjuntos
print(conjunto3)

#Intersección: elemento en común "&"
conjunto3 = conjunto1 & conjunto2
print(conjunto3)

#Elementos que hay en conjunto1 y no en conjunto2
conjunto3 = conjunto1 - conjunto2
print(conjunto3)
conjunto3 = conjunto2 - conjunto1
print(conjunto3)

#Diferencia cinética
#elementos que no comparten o son distintos en cada conjunto
conjunto3 = conjunto1 ^ conjunto2
print(conjunto3)

#Determinar si un conjunto es subconjunto de otro con función .issubset(), ToF
conjunto3 = conjunto1 | conjunto2
print(conjunto1.issubset(conjunto3))
print(conjunto2.issubset(conjunto3))
print(conjunto3.issubset(conjunto2))

#Como saber si ambos conjuntos son disconexos(o sea no comparten ningún elemento)
print(conjunto3.issuperset(conjunto1)) #es un superconjunto porque tiene todos
# los elementos del otro conjunto
print(conjunto3.issuperset(conjunto2))
print(conjunto2.issuperset(conjunto3))
print(conjunto1.issuperset(conjunto3))

#Para saber si ambos conjuntos son disconexos(no tienen elementos en común)
print(conjunto1.isdisjoint(conjunto2))#NOhay elementos en común
#LOS CONJUNTOS NO SON NI TOTALMENTE MUTABLES NI INMUTABLES, no se pueden modificar

#convertir un conjunto totalmente en inmutable
conjunto1 = frozenset #esta función hace al conjunto completamente inmutable
#no se puede agregar, modificar ni eliminar elementos del conjunto

#repaso de diccionarios
#Creamos un diccionario en una sola línea:
diccionarioNuevo = {'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green', 'Amarillo': 'Yellow'}
print(diccionarioNuevo)
#Para eliminar
del (diccionarioNuevo['Azul'])
print(diccionarioNuevo)
#Agregar elementos(cadenas, números, listas, y hasta diccionarios)
diccionario2 = {'Ariel': {'Edad': 40, 'Altura': 1.83}, 'Osvaldo': [45, 1.85], 'Natalia': [35, 1.67]}
# Aquí hay diccionarios dentro de otros, tb cadenas, listas, tipo int, tipo float.
print(diccionario2)

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 Millones', 'Posición': 'Extremo derecho'},
    11: {'Nombre': 'Ángel Di María', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 Millones', 'Posición': 'Extremo derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 Millones', 'Posición': 'Media Punta'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 Millones', 'Posición': 'Defensa Central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 Millones', 'Posición': 'Portero'},
    12: {'Nombre': 'Emiliano Martinez', 'Edad': 31, 'Altura': 1.96, 'Precio': '5 Millones', 'Posición': 'Arquero'},
    13: {'Nombre': 'Nicolás Tagliafico', 'Edad': 31, 'Altura': 1.76, 'Precio': '10 Millones', 'Posición': 'Delantero'},
    14: {'Nombre': 'Nahuel Molina', 'Edad': 25, 'Altura': 1.75, 'Precio': '12 Millones', 'Posición': 'Delantero'},
    17: {'Nombre': 'Emir Siri', 'Edad': 35, 'Altura': 1.73, 'Precio': '13 Millones', 'Posición': 'Delantero'}
}
print(seleccionArgentina[10])
print(seleccionArgentina.values())
#Recorremos el diccionario
for llave in seleccionArgentina.items():
    print(llave, valor)

print('Tenemos cargados la cantidad de jugadores: ', end=' ')
print(len(seleccionArgentina))

#MÉTODO PILAS (usando listas)
pila = [1, 2, 3]
#Agregar elementos a la pila a el final como una pila
pila.append(4)
pila.append(5)
print(pila)
#Sacamos elemntos por el final, y lo asignamos a la variable
elementoBorrado = pila.pop()
print(f'Sacamos el elemento {elementoBorrado}')
print(f'La pila ahora es: {pila}')

#COLAS EN LISTAS
#Estructura de datos de tipo "fifo" (first input/first output) primero entra primero sale
cola = ['Ariel', 'Osvaldo', 'Lilian', 'Pilar']
#Agregamos elementos
cola.append('Natalia')
cola.append('José')
print(cola)
#Sacamos elementos
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

#Clase 4ej5
#otra forma de recorrer un diccionario con ciclo for
for i in seleccionArgentina:
    print(f'{i} -> {seleccionArgentina[i]}')