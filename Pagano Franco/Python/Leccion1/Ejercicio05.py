"""
Ejercicio 5: Factorial dde un número positivo
Hacer un programa para calcular el factorial de un número positivo
"""
numero =int(input("Ingrese un numero positivo: "))
i = 1
factorial = 1
# Creamos la condición para que el usuario ingrese un número positivo
while numero <= 1:
    numero =int(input("Ingrese un numero POSITIVO: "))
else:
    # De esta forma iteramos a "i" partiendo de 1 hasta el numero
    for i in range(1,numero+1):
        factorial *= i

print(f"El resultado del factorial de {numero} es: {factorial}")
