# *** EJERCICIO DE COLECCIONES 1 ***
# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuación
# elimine los elementos repetidos. Por último mostrar la lista.

# Creamos una lista
print('Creamos una lista: ')
lista = [1,2,3,'Yamil','Yamil','Jesus',2,3,'Jose',5]
print(lista)

# Eliminamos los datos repetidos
print('Convertimos la lista a un conjunto set')
conjunto = set(lista) # Convertimos la lista a un conjunto del tipo set
print(conjunto)
print('Se han eliminado los datos repetidos')
print('Convertimos el conjunto a una lista nuevamente')
lista = list(conjunto)
print('Nuestra nueva lista será: ')
print(lista)

# Cómo hacerlo en una sola linea de código:
print('Eliminamos los datos repetidos en una sola linea de código eficiente: ')
listaInicial = [1,2,3,'Yamil','Yamil','Jesus',2,3,'Jose',5]
print(set(listaInicial))
