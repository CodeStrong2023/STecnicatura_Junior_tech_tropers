"""
Ejercicio 11: Agenda telefonica
Hacer un programa que simule una agenda de contactos. Crear un
diccionario donde la clave sea el nombre de usuario y el valor
sea el telefono, el programa tendra el siguiente menu de opciones:
    1. Nuevo contacto
    2. Borrar contacto
    3. Ver contactos existentes.
    4. Salir
"""
opcion = 0
agenda = {}
while True:
    print("\n 1. Nuevo contacto \n 2. Borrar contacto \n 3. Ver contactos existentes. \n 4. Salir")
    opcion = int(input("Seleccione una opcion: "))
    if opcion == 1:
        usuario = input("Ingrese el nombre del contacto: ")
        if usuario not in agenda:
            telefono = input("Ingrese el numero del contacto: ")
            agenda[usuario] = telefono
        else:
            print("El contacto se encuentra cargado: ")
            print(usuario, telefono)
    elif opcion == 2:
        usuario = input("Ingrese el nombre del contacto a eliminar: ")
        if usuario in agenda:
            agenda.pop(usuario)
            print(f"El contacto {usuario} se elimino de la agenda")
        else:
            print(f"El contacto {usuario} no se encuentra en la agenda")
    elif opcion == 3:
        print("Los contactos de la agenda son: ")
        for usuario, telefono in agenda.items():
            print(usuario, telefono)
    elif opcion == 4:
        print("Gracias por usar la agenda")
        break
    else:
        print("La opcion seleccionada es incorrecta: ")