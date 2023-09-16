import math # Importamos la clase math para hacer uso de la funcion sqrt (raiz cuadrada)

# Ejercicio de matematicas
# Para sacar la raiz cuadrada de un numero positivo

numero = int(input('Digite un número:'))

while numero < 0:
    print('*** Error --> Debería ser un número positivo ***')
    numero = int(input('Digite un número positivo: '))
print(f'\nSu sauz cuadrada es: {math.sqrt(numero):.2f}') # el :.2f es para 2 decimales