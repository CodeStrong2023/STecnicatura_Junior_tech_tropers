# Ejercicio 11: Agenda telefonica
# Hacer una programa que simule una agenda de contactos. Crear un diccionario
# donde la clave sea el nombre de usuario y el valor
# sea el telefono, el programa tendrá el siguiente menu de opciones:
#       1.  Nuevo contacto
#       2.  Borrar contacto
#       3.  Ver contactos existentes
#       4.  Salir

agenda = {}
while True:
    print('\n.:MENU:.')
    print('1. Nuevo Contacto')
    print('2. Borrar Contacto')
    print('3. Ver contactos existentes')
    print('4. Salir')
    opcion = int(input('Digite una opcion de menú: '))
    if opcion == 1:
        nombre = input('Digite el nombre del contacto: ')
        telefono = input('Digite el número de telefono: ')
        if nombre not in agenda:
            agenda[nombre] = telefono
            print('Contacto agregado exitosamente.')
        else:
            print('Este nombre de contacto ya existe')
    elif opcion == 2:
        nombre = input('¿Cual es el nombre del contacto?: ')
        if nombre in agenda:
            del(agenda[nombre])
            print('Se ha eliminado el contacto.')
        else:
            print('Este contacto no existe en la agenda')
    elif opcion == 3:
        print('*** Agenda de contactos ***')
        for clave,valor in agenda.items():
            print(f'Nombre: {clave}, Teléfono: {valor}')
    elif opcion == 4:
        print('Gracias por utilizazr su agenda de contactos.')
        break
    else:
        print('La opción ingresada es incorrecta.')
        print()
