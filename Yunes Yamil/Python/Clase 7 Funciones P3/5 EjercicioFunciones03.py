# Ejercicio 3: Funcion recursiva
# Imprimir numero de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el
# valor de 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser el numero 3 debe imprimir
# 3
# 2
# 1
# Si se ingresan numero negativos no imprime nada

def imprimir_numeros_recursivos(numero):
    if numero >= 1: #Caso base
        print(numero)
        imprimir_numeros_recursivos(numero-1) # Caso recursivo
    elif numero == 0:
        return
    elif numero <= 0:
        print('El valor ingresado es incorrecto.')

imprimir_numeros_recursivos(3)

# Tarea: que el numero lo ingrese el usuario.
print('*** SI EL NUMERO LO DEBE INGRESAR EL USUARIO*** ')
def imprimir_numeros_recursivos(numero):
    if numero >= 1: #Caso base
        print(numero)
        imprimir_numeros_recursivos(numero-1) # Caso recursivo
    elif numero == 0:
        return
    elif numero <= 0:
        print('El valor ingresado es incorrecto.')

numeroDescendente = int(input('Digite el numero para desplegar: '))
resultado = imprimir_numeros_recursivos(numeroDescendente)

