# Ejercicio 11: Agenda Telefonica
# Hacer un programa que simule una agenda de contactos. Crear un
# directorio donde la clave sea el nombre del usuario y el valor
# sea el telefono, el programa tendra el sigiente menú de opciones:
#           1. Nuevo contacto
#           2. Borrar contacto
#           3. Ver contactos existentes.
#           4. Salir

agenda = {}
while True:
    print('\t._:MENU:_.')
    print('1. Nuevo contacto')
    print('2. Borrar contacto')
    print('3. Ver contactos existentes')
    print('4. Salir')
    opcion = int(input('Digite una opción de menú: '))
    if opcion == 1:
        nombre = input("Digite el nombre del contacto: ")
        telefono = input("Digite el número de telefono: ")
        if nombre not in agenda:
            agenda[nombre] = telefono
            print("Contacto agregado existente!")
        else:
            print("Este nombre de contacto ya existe")
    elif opcion == 2:
        nombre = input("Cuál es el nombre de contacto:")
        if nombre in agenda:
            del (agenda[nombre])
            print("Se a eliminado el contacto")
        else:
            print("EL contacto no existe en la agenda")
    elif opcion == 3:
        print("Agenda de contactos")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Telefono: {valor}")
    elif opcion == 4:
        print("Gracias por usar su agenda de contactos")
        break
    else:
        print("La opción ingresada no es correcta")
    print()