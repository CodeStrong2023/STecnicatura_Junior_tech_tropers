# Ejercicio 08: Menú intectivo - Cajero automatico
# Hacer un programa que simule un cajero automatico con un saldo
# inicial de 1000$ y ttendra el siguente menú de opciones:
saldo = 1000
while True:
    print("\tBanco Nación")
    print("1- Ingresa dinero a la cuenta ")
    print("2- Retira dinero a la cuenta ")
    print("3- Mostrar dinero disponible ")
    print("4- Salir")
    opcion = int(input("Digite una opción de menú: "))
    print()  # Salto de linea
    if opcion == 1:
        extra = float(input("Cuanto dinero desea ingresar: "))
        saldo += extra
        print(f"Dinero en la cuenta al momento: ${saldo}")
    elif opcion == 2:
        retira = float(input("Cuanto dinero desea retirar: "))
        if retira > saldo:
            print("No tiene esa cantidad de dinero")
        else:
            saldo -= retira
            print(f"Dinero en la cuneta al momento: $ {saldo}")
    elif opcion == 3:
        print(f"Su saldo es: {saldo}")
    elif opcion == 4:
        print("Hasta luego vuelva pronto!!!!")
        break
    else:
        print("Opción no valida")
        print()
