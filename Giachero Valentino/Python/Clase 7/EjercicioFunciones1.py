#Ejercicio 1: Función con * args para multiplicar
#Crear una función para multiplicar los valores recibidos
#de tipo númerico, utilizando argumentos variables *args
#como parámetro de la función y regresar como resultado
#la multiplicación de todos los valores pasados como argumento

#Definimos la función para multiplicar
def multiplicar_valores(*numeros):
    resultado = 1
    for numero in numeros:
        resultado *= numero
    return resultado

#Llamamos a la función
print(multiplicar_valores(3,5,15)) #Le pasamos los argumentos