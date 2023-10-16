# Ejercicio 01: Crea una funcion para sumar valores recibidos de tipo
# numéricos, utilizando argumentos variables *args como parametros de la
# Funcion y agregar como resultado la suma de todos los valores pasados
# como argumentos

def sumaTodo(*args):  # Recibimos una cantidad de parametros indefinidos
    print(args)
    resultado = 0
    # Iteramos elemento
    for i in args:
        resultado += i
    return resultado


# Llamamos a la funcion
print(sumaTodo(3, 5, 9))
