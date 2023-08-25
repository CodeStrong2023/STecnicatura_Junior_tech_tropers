# lista = Elemento1, Elemento2, Elemento3, Elemento4
"""
Al crear una lista, los elementos toman posiciones como elementos de un conjunto.
"""
nombres = ["Elemento1", "Elemento2", "Elemento3", "Elemento4"]
print(nombres)
"""
Para recorrer del primer elemento al ultimo:
"""
print(nombres[0]) #Podemos visualizar un elemento en espesifico de la lista
print(nombres[1])
print(nombres[2])
print(nombres[-1]) #podemos visualizar el ultimo elemento, sin saber cual es
"""
Para recorrer del ultimo  elemento al primero:
"""
print(nombres[-1])
print(nombres[-2])
print(nombres[-3])

#-----------------------------------------------------------------------
nombres = ["Elemento1", "Elemento2", "Elemento3", "Elemento4"]
print(nombres)
print(nombres[0:2]) #Podemos visualizar los elementos dentro del rango nombres[0] y nombres[1]
print(nombres[ :3]) #Podemos visualizar desde el primer elemento hasta el nombres[2]
print(nombres[1: ]) #Podemos visualizar desde el nombres[1] hasta el ultimo

#Modificar un valor dentro de la lista
nombres[3] = "ElementoX"
print(nombres)

#Iterar una lista
for nombre in nombres: #nombre es singular, la lista plural
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

#-----------------------------------------------------------------------
# Preguntarnos cuantos elementos tiene
print(len(nombres)) # Len determina la cantidad de elementos del parametro (la lista)

# Agregamos un elemento
nombres.append("ElementoS")
print(nombres)

# insertar un elemento en un indice espesifico
nombres.insert(1, "ElementoA") #Se agrega el elemento en dicha posicion, pero desplaza los demas a la derecha
print(nombres)
nombres.insert(2, "ElementoB")
print(nombres)

# Eliminar un elemento
nombres.remove("ElementoA") #Se elimina el elemento y se desplazan los siguiente a la izquierda
print(nombres)

# Eliminar el ultimo elemento
nombres.pop()
print(nombres)

# Eliminar un indice especifico
del nombres[1] # "del" de DELETE
print(nombres)

# Eleminar/borar/limpiar todos los elemtnos
nombres.clear()
print(nombres)
"""
# Eliminar la lista
del nombres
print(nombres)
"""
#------------------------------------------------------------------
"""
Ejericio N°1: Iterar un rango de 0 a 10 pero imprimir numeros divisibles entre 3.
Ejemplo 0, 3, 6, 9 
"""
print("Rango de 0 a 10 con numeros divisibles entre 3")
#Segun yo
for i in range(10): #El erro es que un range(10) va del 0 al 9
    if i % 3 == 0:
        print(i)
#Segun video
for i in range(11):
    if i % 3 == 0:
        print(i)
"""
Ejercicio N°2: Crear un rango de numeros de 2 a 6 e imprimirlos
Ejemplo: 2, 3, 4, 5, 6
"""
print("Rango con valores de inicio = 2 y fin = 6")
# Segun yo
for x in range(7):
    if x > 1 :
        print(x)
#Segun video
rango = range(2, 7)
for i in rango:
    print(i)
"""
Ejercicio N°3: Iterar un rango de 3 a 10 pero con incremento de 2 en 2 en 
lugar de 1 en 1. Ejemplo 3, 5, 7, 9
"""
# Segun yo
rango = range(3, 11)
for y in rango:
    if y % 2 != 0:
        print(y)
# Segun video
print("El rango de inicio 3 y fin 10")
for i in range(3, 11, 2):
    print(i)

#-----------------------------------------------------------------------

# Definimos una tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)
print(len(cocina)) #Contamos la cantidad de elementos

# Acceder a un elemento (debemos usar corchetes y no parentesis).
print(cocina[0]) #Del primero al ultimo
print(cocina[-1]) #Del ultimo al primero

# Acceder a un rango
print(cocina[0:2])

# Recorremos los elementos de la tupla
for cocinar in cocina:
    print(cocinar) # esta usando \n para saltos de linea

for cocinar in cocina:
    print(cocinar, end= " ") # Elimina los saltos de linea

# MODIFICAR UNA TUPLA
# cocina[0] = "plato" //Recordar que esto no se puede
# convertir de tupla a lista // Para poder modificarla
cocinaLista = list(cocina)
cocinaLista[0] = "Plato"
# Convertir de lista a tupla
cocina = tuple(cocinaLista)
print("\n",cocina)

#---------------------------------------------------------------------

# Ejercicio de tupla: Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8) # Definimos la tupla
"""
Crear una lista que solo incluya los numeros menores a 5
e imrpima por consola [1, 3, 2]
"""

lista = [] # Definimos una lista vacia
# Filtramos los elemenetos menores a 5 de la tupla
for numero in tupla:
    if numero < 5:
        lista.append(numero)
print(f"La nueva lista es: {lista}")
