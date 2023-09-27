# Ejercicio Func 1: Crear una función para sumar los valores recibidos de tipo
# numérico, utilizando argumentos, variables *arg, como parámetro de la
# función y agregar como resultado la suma de todos los valores pasados
# como argumentos.

def sumar_valor(*args):  # *arg para cant de parámetros indefinidos
    #pass  # pass se usa para no dejar vacía la función y tengamos error
    resultado = 0
    for valor in args:
        resultado += valor #Realizamos la suma
    return resultado


print(sumar_valor(3, 5, 9, 2, 1))
