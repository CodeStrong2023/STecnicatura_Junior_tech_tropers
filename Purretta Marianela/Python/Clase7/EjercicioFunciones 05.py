#Ejercico 5: Convertidor de temperaturas
#Realizar dos funciones para convertir de grados celcius a
#farenheit y viseversa.
#Investigar las fórmulas

# Convertir de celsius a fahrenheit
def celsius_a_fahrenheit(fahrenheit):
    return celsius * 9 / 5 + 32
# Convertir de fahrenheit a celsius
def fahrenheit_a_celsius(fahrenheit):
    return(fahrenheit - 32) * 5 / 9

celsius = float(input('Ingrese la temperatuta en celsius: '))
resultado = celsius_a_fahrenheit(celsius)
print(f'{celsius} grados celsius equivale a {resultado:.2f} grados Fahrenheit')

fahrenheit = float(input('Ingrese la temperatura en fahrenheit: '))
resultado = fahrenheit_a_celsius(fahrenheit)
print(f'{fahrenheit} grados fahrenheit equivale a {resultado:.2f} grados celsius')