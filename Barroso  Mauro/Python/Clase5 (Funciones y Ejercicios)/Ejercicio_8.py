#Ejercicio8: Menú interactivo:Cajero automático
#Hacer un programaque simule un cajero automático con un saldo
#inicial de 1000$ y tendrá el ste menú de opciones:
        #1. Ingresar
        #2. Retirar dinero de la cuenta
        #3. Mostrar dinero disponible
        #4. Salir

saldo = 1000
while True:
    print("\n.:Menú:.")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    opcion = int(input("Elija una opción del .:Menú:.: "))
    print()
    if opcion == 1:
        extra = float(input("Cuánto dinero desea ingresar -> "))
        saldo += extra
        print(f"Dinero en la cuenta al momento: $ {saldo}")
    elif opcion == 2:
        retira = float(input("Cuánto dinero desea retirar -> "))
        if retira > saldo:
            print(f"No puede retirar más dinero del disponible, su máximo para retirar es: {saldo}")
        else:
             saldo -= retira
        print(f"Dinero disponible en la cuenta al momento: $ {saldo}")
    elif opcion == 3:
        print(f"Dinero disponible en la cuenta al momento: $ {saldo}")
    elif opcion == 4:
        print("Gracias por utilizar su cajero automático")
        break
    else:
        print("Opción incorrecta de Menú")
        print()