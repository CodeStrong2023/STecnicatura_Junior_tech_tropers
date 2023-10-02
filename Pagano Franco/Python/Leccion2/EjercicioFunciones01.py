"""
Ejercicio 01: Crear una funcion para sumar los valores recibidos de tipo numerico,
utilizando argumentos variables *args como parametros de la funcion y agregar
como resultado la suma de todos los valores pasados como argumentos
"""
def sumarArg(*args): # Recibimos una cantidad de parametros indefinidos
    suma = 0
    for n in args:
        suma += n
    return suma

resoltado = sumarArg(1, 2, 3, 4, 5)
print(f"El resultado de la suma es: {resoltado}")