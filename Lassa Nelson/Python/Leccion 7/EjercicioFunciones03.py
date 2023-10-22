# Ejercicio 3: Función Recursiva
# Imprimir número de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el
# valor de 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser el número 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan número negativos no imprime nada

def imprimirNumero(args):
    if args <= 0:
        return
    else:
        print(args)
        imprimirNumero(args - 1)  # Vamos restando uno para arriba ir imprimiendo el anterior


numero = int(input("Ingrese un número positivo: "))

while numero <= 0:
    numero = int(input("Te dije un número positivo: "))

imprimirNumero(numero)

print("\t\t\tForma del profe si es difirente de la mia")


def imprimir_numeros_recursivos(numero):
    if numero >= 1:
        print(numero)
        imprimir_numeros_recursivos(numero - 1)
    elif numero == 0:
        return
    elif numero <= 0:
        print("Valor ingresado incorrecto")


imprimir_numeros_recursivos(5)
