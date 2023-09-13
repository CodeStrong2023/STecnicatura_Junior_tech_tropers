# 'Maradona':10  Un diccionario está compuesto por dos elementos
# Una LLAVE y un VALOR
# dict(key,value)

diccionario = {
    'IDE':'Integrated Development Enviroment',
    'POO':'Programación Orientada a Objetos',
    'SABD':'Sistema de Administración de Base de Datos'
}
print(diccionario)
# Verificamos la cantidad de elementos
print(len(diccionario))

# Acceder a un diccionario con la llave (key)
print(diccionario['IDE']) # Respetar la escritura para evitar error

# Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificar elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)
# UN DICCIONARIO PUEDE MODIFICARSE

# Recorrer elementos
for termino in diccionario: # Recorremos mostrando solo las llaves
    print(termino)

# Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys(): # Estamos usando una funcion
    print(termino) # Muestra solo las llaves

for valor in diccionario.values(): # Usamos una funcion para acceder al valor
    print(valor)

# Comprobar existencia de algun elemento
print("*** Comprobar existencia de elemento")
print('IDE' in diccionario) # Devuelve un booleano

# Agregar un elemento
print("*** Agregar un elemento")
diccionario['PK'] = 'Primary Key'
print(diccionario)

# Eliminar un elemento
print("*** Eliminar elemento")
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
print("*** Vaciar diccionario")
diccionario.clear()
print(diccionario)

# Eliminar un diccionario
print("*** Eliminar diccionario")
del diccionario # El diccionario se borra
print(diccionario)






