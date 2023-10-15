# Ejercicio 5: Convertidor de temperaturas
# Realizar dos funciones para convertir de grados celcius
# a farenheit y viseversa.
# Investigar las formulas

# Funcion que convierte de celcius a farenheit
def celsius_fahrenheit(celsius):
    return celsius * 9/5 + 32 # La precedencia: multiplicacion, division y suma

# Funcion que convierte de fahrenheit a celsius
def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9 # Utilizamos parentesis para respetar la precedencia.

celsius = float (input('Digite el valor de celsius: '))
resultado = celsius_fahrenheit(celsius)
print(f'{celsius} C a F -> {resultado:.2f}')

fahrenheit = float(input('Digite un valor de fahrenheit: '))
resultado = fahrenheit_celsius(fahrenheit)
print(f'{fahrenheit} F a C -> {resultado:.2f}')

# .2f es para dos decimales

