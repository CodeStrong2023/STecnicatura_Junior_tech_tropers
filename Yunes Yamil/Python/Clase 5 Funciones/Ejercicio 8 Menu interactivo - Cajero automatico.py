# Ejercicio 8: Menu Interactivo - Cajero Automatico
# Hacer un programaque simule un cajero automatico con un saldo
# inicial de $1000 y tendrá el siguiente menu de opciones:
#           1. Ingresar dinero en la cuenta
#           2. Retirar dinero de la cuenta
#           3. Mostrar dinero disponible
#           4. Salir

saldo = 1000
while True:
    print("\t.:MENU:.")
    print("\t1. Ingresar dinero en la cuenta.")
    print("\t2. Retirar dinero de la cuenta.")
    print("\t3. Mostrar dinero disponible.")
    print("\t4. Salir.")
    opcion = int(input("Digite una opcion de menu: "))
    print()
    if opcion == 1:
        extra = float(input("Cuánto dinero desea ingresar --> "))
        saldo += extra
        print(f'Dinero en la cuenta al momento: ${saldo}')
    elif opcion == 2:
        retirar = float(input("Cuánto dinero desea retirar --> "))
        if retirar > saldo:
            print("No tiene esa cantidad de dinero. ")
        else:
            saldo -= retirar
            print(f'Dinero en la cuenta al momento: {saldo}')
    elif opcion == 3:
        print(f'Dinero en la cuenta al momento: {saldo}')
    elif opcion == 4:
        print("Gracias por utilizar su cajero automatico. Hasta pronto!")
        break
    else:
        print("Opcion incorrecta.")
        print()

