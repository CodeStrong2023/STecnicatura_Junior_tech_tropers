#Ejercicio 3: Función Recursiva
#Imprimir números del 5 al 1 de manera descendente usando funciones recursivas

numero = int(input("Digite un número: "))
def imprimir_num_recursivos(numero):

    if numero >= 1:
        print(numero)
        imprimir_num_recursivos(numero-1)
    elif numero == 0:
        return
    elif numero <= 0:
        print("El valor es incorrecto")
imprimir_num_recursivos(numero)