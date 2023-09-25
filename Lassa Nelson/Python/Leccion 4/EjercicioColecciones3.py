# Ejercicio 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes
# del señor de los anillos
# Nombre: Aragon
# Clase: Guerrero
# Raza: Dúnadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sindar

personajes = []  # Creamos una lista vacia
# Creamos diccionarios
P1 = {"Nombre": "Aragon", "Clase": "Guerrero", "Raza": "Dúnadan del Norte"}
personajes.append(P1)
P2 = {"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"}
personajes.append(P2)
P3 = {"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo Sindar"}
personajes.append(P3)
print(personajes)

# Agregamos 3 personajes mas
P4 = {"Nombre": "Galadriel", "Clase": "Dama de los galadhrim", "Raza": "Elfo Sindar"}
personajes.append(P4)
P5 = {"Nombre": "Sauron", "Clase": "Señor Oscuro", "Raza": "Ainur y Maiar"}
personajes.append(P5)
P6 = {"Nombre": "Frodo", "Clase": "Portador del Anillo", "Raza": "Hobbit"}
personajes.append(P6)
print(personajes)

