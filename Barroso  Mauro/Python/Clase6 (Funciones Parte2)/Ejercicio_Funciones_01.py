# Ejercicio 01: Crear una función para sumar los valores recibidos de tipo numérico, utilizando argumentos, variables *arg, como parámetro de la función y agregar como resultado la suma de todos los valores pasados como argumentos.

def sumar_valor(*args):
    resultado = 0
    for valor in args:
        resultado += valor
    return resultado
print(sumar_valor(3, 5, 9))