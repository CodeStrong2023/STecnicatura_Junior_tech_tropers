#Ejercicio 2:Agenda telefónica
#Hacer un programa que simule una agenda de contactos. Crear
#un diccionario donde la clave sea el nombre del usuario y el valor
#sea el telofono, el programa tendrá el siguiente menú de opciones:
#1.Nuevo contacto
#2.Borrar contacto
#3.Ver contactos existentes
#4.Salir

#Creamos el diccionario vacío
contactos = {}

while True:
    #Menú con opciones
    print(".::Contactos, selecciones una opción::.")
    print("1.Nuevo contacto")
    print("2.Borrar contacto")
    print("3.Ver contactos existentes")
    print("4.Salir")
    print(" ")

    #Solicitamos que se inserte una opción
    opcion = input("Selecciona la opción que desee: ")

    if opcion == "1":
        nombre = input("Digite el nombre de contacto: ")
        telefono = input("Digite el número de telefono: ")
        if nombre not in contactos:
            contactos[nombre] = telefono
            print("El contacto agregado exitosamente!!")
            print(" ")
        else:
            print("El contacto ya existe")
            print(" ")
    elif opcion == "2":
        nombre = input("Ingrese el nombre del usuario a eliminar: ")
        if nombre in contactos:
            del(contactos[nombre])
            print("El contacto se eliminó correctamente")
            print(" ")
        else:
            print("El contacto no existe")
            print(" ")

    elif opcion == "3":
        print("Agenda de contactos")
        for clave, valor in contactos.items():
            print(f"Nombre: {clave}, Teléfono: {valor}")

    elif opcion == "4":
        print("Hasta luego")
        break
    else:
        print("Opción incorrecta")