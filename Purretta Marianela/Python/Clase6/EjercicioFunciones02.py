#Ejercicio 2: Función con * args para multiplicar
#Crear una función para multiplicar los valores recibidos
#de tipo numérico, utilzando argumentos variables * args
#como parámetro de la función y regresar como resultado
#la multiplicación de todos los valores pasados como argumentos

def multiplicar_valores(*numeros):
    resultado = 1 #desde 0 no se puede multiplicar
    for numero in numeros:
        resultado *= numero
    return resultado

print(multiplicar_valores(5, 2, 15, 8)) #valores por argumento

