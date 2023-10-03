"""
Ejercicio 5: Convertidor de temperaturas
Realizar dos funciones para convertir de grados celsius
a fahrenheit y viseversa
INVESTIGAR FORMULAS
"""
def convertidorFahrenheir(temperatura):
    temperaturaFaherenheir = (temperatura*(9/5))+ 32
    return temperaturaFaherenheir

def convertidoCelsius(temperatura):
    temperaturaCelsius = (temperatura - 32)* (5/9)
    return temperaturaCelsius

opcion = 3
while (opcion != 2 & opcion !=1 ):
    print("1. Convertir de Celsius a Fahrenheir")
    print("2. Convertir de Fahrenheir a Celsius")
    opcion = int(input("Ingrese una opcion: "))
    if opcion == 1:
        temperatura = float(input("Ingrese la temperatura en grados celsius: "))
        print(f"El valor de la temperatura en grados fahrenheir es: {convertidorFahrenheir(temperatura)} ªF")
    elif opcion == 2:
        temperatura = float(input("Ingrese la temperatura en grados fahrenheir: "))
        print(f"El valor de la temperatura en grados celsius es: {convertidoCelsius(temperatura)} ªC")