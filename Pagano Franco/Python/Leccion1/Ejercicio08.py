"""
Ejercicio 8: Menu interactivo - Cajero automatico
Hacer un programa que simule un cajero automatico con
saldo inical de $1000 y tendra el siguiente menu de opciones:
    1. Ingrese dinero en la cuenta
    2. Retirar dinero de la cuenta
    3. Mostrar dinero disponible
    4. Salir
"""
import time

numero = 0
saldo = 1000
while numero != 4:
    print("Cajero Automatico")
    print("1- Ingrese dinero en la cuenta")
    print("2- Retirar dinero de la cuenta")
    print("3- Mostrar dinero disponible")
    print("4- Salir")
    numero = int(input("Ingrese la opción: "))

    if numero == 1:
        numero = int(input("Digite el monto de dinero a ingresar: "))
        saldo += numero
        print(f"El salgo se actualizo a ${saldo}")
        time.sleep(5)
    elif numero == 2:
        if saldo > 0:
            numero = int(input("Ingrese el monto de dinero a retirar: "))
            if numero <= saldo:
                saldo -= numero
                print(f"El salgo se actualizo a ${saldo}")
                time.sleep(5)
            else:
                print(f"Saldo actual ${saldo}")
                print("No puedes retirar un monto mayor a tu saldo actual")
                time.sleep(5)
        elif saldo == 0:
            print(f"Saldo actual ${saldo}")
            print("No tienes saldo para retirar")
            time.sleep(5)
    elif numero == 3:
        print(f"El salgo actual es de: ${saldo}")
        time.sleep(5)

print("Adios")