#Ejercicio 2: Funcipn con *args para multiplicar. Crear una función para multiplicar los valores recibidos de tipo numérico, utilzando argumentos variables *args como parámetro de la función y regresar como resultado la multiplicación de todos los valores pasados como argumentos
def multiplicar_valores(*numeros):
    resultado = 1
    for numero in numeros:
        resultado *= numero
    return resultado

print(multiplicar_valores(3, 5, 15))