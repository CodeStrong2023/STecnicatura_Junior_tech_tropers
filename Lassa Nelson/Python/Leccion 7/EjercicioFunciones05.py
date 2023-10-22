# Ejercicio 5: Convertidor de temperaturas
# Realizar dos funciones para convertir de grados a celsius
# a fahernheit y viseversa.
# Investigas las formulas

def celsius_Fahrenheit(temp):
    tempF = (temp * (9 / 5)) + 32
    return tempF

def fahrenheit_Celsius(temp):
    tempC = (temp - 32) * (5 / 9)
    return tempC


while True:
    print("\t\tCalculadora: ")
    print("1. Convertir de grados Celsius a grados Fahrenheit")
    print("2. Convertir de grados  Fahrenheit a grados Celsius")
    print("3. Salir")

    opcion = input("Ingrese el numero de la opción: ")

    if opcion == "1":
        temp = float(input("Ingrese la Temperatura en grados Celsius: "))
        print(f"{temp}°C, son ",celsius_Fahrenheit(temp),"°F")
    elif opcion == "2":
        temp = float(input("Ingrese la Temperatura en grados Fahrenheit: "))
        print(f"{temp}°F, son ",fahrenheit_Celsius(temp),"°C")
    elif opcion == "3":
        print("Que la información le haya sido util")
        break
    else:
        print("Opcion no valida. Elija 1-2-3")
