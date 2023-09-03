# Tipo set

planetas = {"Marte", "júpiter", "Venus"}
print(len(planetas))  # Usamos la funcion len = length significa largo

# Revisa si un elemento existe dentri de set
print("Marte" in planetas)

print("Jupiter" in planetas)  # tambien debemos ingresar los acentos

print("Marte" not in planetas)  # Verifica si no esta en la función

# Agregamos un elemento
planetas.add("Tierra")  # add es una fincion para agregar
# No permite repetir o agregar elemtos iguales
planetas.add("Tierra")
planetas.add("Tierra")
planetas.add("Tierra")
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove("júpiter")
print(planetas)
# Elimina pero al equivocarnos no presenta error
planetas.discard("tierra")
print(planetas)

# Limpiar set
planetas.clear()
print(planetas)

# Eliminar set o conjunto
del planetas
# print(planetas)

# "Maradona" : 10 Un diccionario esta compuesto por 2 elementos
# Una llave y un valor
# dict(key,value)
diccionario = {
    "IDE": "Integrated Developmen Enviorenment",
    "POO": "Programación Orientada a Objetos",
    "Sabd": "Sistema de Administración de Base de Datos"
}

# Verificar la cantidad de elementos del diccionario
print(len(diccionario))

# Acceder a un diccionario con la llave(key)
print(diccionario["IDE"])

# Otra forma de recuperar un elemento
print(diccionario.get("POO"))
print(diccionario.get("Sabd"))

# Modificamos elementos
diccionario["IDE"] = "Entorno de Desarrollo Integrado"
print(diccionario)

# Como Recorrer los elementos
for termino in diccionario:
    print(termino)

# Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys():  # Estamos usando una función
    print(termino)  # Muestra solo las llaves

for valor in diccionario.values():  # Usamos una funcion para acceder al valor
    print(valor)

# Comprobar la existencia de algún elemento
print("IDE" in diccionario)

# Agregar un elemento
diccionario["PK"] = "Primary key"
print(diccionario)

# Eliminar un elemento
diccionario.pop("Sabd")
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario  # Elimina el diccionario

# Las listas es lo que se conoce en otros lenguajes como arreglos o vectores
nombres = ["Nelson", "Mariano", "Valentin", "Jose"]  # volvemos a definir la lista ya que estamos en otro proyecto

# Agregamos otro elemento
nombres.append("sofi")
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

# Concatenamos listas
lista1 = [1, 2, 3]
lista2 = [3, 4, 5, 6]
lista3 = lista1 + lista2  # Concatetación
print(lista3)

lista3.extend([7, 8, 9])
print(lista3)

# Funcion para ubicar un elemento (valor ingresado) en que indice se encuantra
print(lista3.index(3))

# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(3))  # cuenta cuantos valores iguales hay dentro de la lista

# Para poner al reves una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista = lista3 * 2
print(lista)

# Métodos de ordenamiento
lista3.sort()  # Ordena los elemento ascendentemente
print(lista3)

lista3.sort(reverse=True)  # Ordenar los elementos descendentemente
print(lista3)

# Creamos tuplas
tupla = (4, "Hola", 6.78, [1, 2, 78], 4, "Hola")
print(tupla)

print(4 in tupla) # Accion boolenan, su respuesta es de tipo booleana
# Lo que podemos usar dentro de tuplas son: index, count, len
# En tuplas se puede convertir de tupla a lista y de lista a tupla
