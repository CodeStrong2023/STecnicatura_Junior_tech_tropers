#Ejercicio 4: Convertidor de temperaturas
#Realizar dos funciones para convertir de grados celsius
#a fahrengeit y viseversa

#Función que convierte de celsius a fahrenheit
def celcius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32

#Función que convierte de fahrenheit a celsius
def fahrenheit_celcius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9

#Pedimos al usuario los datos
celcius = float(input("Digite el valor de celsius: "))
resultado = celcius_fahrenheit(celcius)
#Mostramos por consola el resultado
print(f"{celcius} C a F = {resultado:.2f}")

#Solicitamos los datos
fahrenheit = float(input("Digite el valor de fahrenheit: "))
resultado = fahrenheit_celcius(fahrenheit)
#Mostramos por consola
print(f"{fahrenheit} F a C = {resultado:.2f}")