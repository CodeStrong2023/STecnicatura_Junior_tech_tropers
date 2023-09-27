#Ejercicio 11: Agenda Telefónica
#Hacer un programa que simule una agenda de contactos, crear un diccionario donde
#la clave sea el nombre de ususario y el valor sea el teléfono
#el programa tendrá el ste menú de opcopnes:
#   1. Nuevo contacto
#   2. Borrar contacto
#   3. Ver contactos existentes
#   4. Salir

agenda = {}
while True:
    print('\n.:MENÚ:.')
    print('1. Nuevo contacto')
    print('2. Borrar contacto')
    print('3. Ver contactos existentes')
    print('4. Salir')
    opcion = int(input('Elija una opción: '))
    if opcion == 1:
        nombre = input('Ingrese el nombre del contacto: ')
        telefono = input('Ingrese el número de teléfono: ')
        if nombre not in agenda:
            agenda[nombre] = telefono
            print('Nuevo contacto agendado!')
        else:
            print('Contacto ya existente')
    elif opcion == 2:
        nombre = input('Ingrese el nombre del contacto: ')
        if nombre in agenda:
            del (agenda[nombre])
            print('Se ha eliminado el contacto de : ' + nombre)
        else:
            print('Nombre no asociado a ningún contacto')
    elif opcion == 3:
        print('Agenda de contactos')
        for clave, valor in agenda.items():
            print(f'Nombre: {clave}, Teléfono: {valor}')
    elif opcion == 4:
        print('Adiós!')
        break
    else:
        print('Opción de menú incorrecta')
    print()