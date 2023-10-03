"""
Ejercicio 2: Funciones con * args para multiplicar
crear una funcion para multiplicar los valores recibidos
de tipo numerico, utilizando argunmentos variables *args
como parametro de la funcion y regresar como resultado
la multiplicacion de todos los valores pasados como argumentos
"""
def multiplicarArg(*args): # Recibimos una cantidad de parametros indefinidos
    producto = 0
    for numero in args:
        producto *= numero
    return producto

print(f"El resultado de la multiplicacion es: {multiplicarArg(1, 2, 3, 4, 5)}")