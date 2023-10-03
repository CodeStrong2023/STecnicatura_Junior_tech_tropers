def factorial(numero):
    if numero == 1: # Caso Base
        return 1
    else:
        return numero * factorial(numero -1) # Caso recursivo

numeroIngresado = int(input("Ingrese un numero: "))
resultado = factorial(numeroIngresado)
print(f"El factorial de {numeroIngresado} es: {resultado}")
print(f"El factorial de {numeroIngresado} es: {resultado}")