# Funciones recursivas

def factorial(numero):
    if numero == 1: # Caso base
        return 1
    else:
        return numero * factorial(numero-1) # caso recursivo

resultado = factorial(5) # Lo hacemos en codigo duro
print(f'El factorial del numero 5 es: {resultado}')

# Tarea: El usuario debe ingresar el numero para calcular el factorial (siguiente ejercicio)

def factorial(numero):
    if numero == 1: # Caso base
        return 1
    else:
        return numero * factorial(numero-1) # caso recursivo

numeroFactorial = int(input('Digite el numero para calcular el factorial: '))
resultado = factorial(numeroFactorial)
print(f'El factorial del numero {numeroFactorial} es: {resultado}')

