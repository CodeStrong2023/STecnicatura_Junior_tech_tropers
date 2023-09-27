#Ejercicio 5: Menú interactivo - Cajero automático
#Hacer un programa que simule un cajero autommático con un saldo
#inicila de $1000 y tendrá el siguiente menú de opciones:
#1. Ingresar dinero en la cuenta
#2. Retirar dinero de la cuenta
#3. Mostrar dinero disponible
#4. Salir

#Iniciamos la variable en mil
saldo = 1000
while True:
    print("-_Menú_-")
    print("1.Ingresar dinero en la cuenta")
    print("2.Retirar dinero de la cuenta")
    print("3.Mostrar dinero disponible")
    print("4.Salir")
    opcion = int(input("Digite una opción de menú: "))
    print()
    if opcion == 1:
        extra = float(input("Ingrese la cifra a ingresar => "))
        saldo += extra
    elif opcion == 2:
        retiro = float(input("Ingrese la cifra a retirar =>"))
        if retiro > saldo:
            print("Saldo insuficiente")
        else:
            saldo -= retiro
    elif opcion == 3:
        print(f"Su saldo disponible es: {saldo}")
    elif opcion == 4:
        print("Hasta luego 👋👋")
        break
    else:
        print("Esta opción es incorrecta")