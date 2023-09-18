#Ejercicio 3: Agregar personajes a una lista
#Escriba un programa donde cree una lista con los siguientes personajes del señor de los porrillos
#Nombre: Aragon
#Clase: Montaraz
#Raza: Dúnadan del Norte

#Nombre: Gandalf
#Clase: Mago Blanco
#Raza: Istar

#Nombre: Legolas el elfito arquero
#Clase: Arquero
#Raza: Elfo Sindar

personajes = [] #Creamos una lista vacia
#Creamos diccionarios

P1 = {'Nombre': 'Aragon', 'Clase': 'Montaraz', 'Raza': 'Dúnadan del Norte'}
P2 = {'Nombre': 'Gandalf', 'Clase': 'Mago Blanco', 'Raza': 'Istar'}
P3 = {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'}
P4 = {'Nombre': 'Frodo', 'Clase': 'Portador del anillo', 'Raza': 'Hobbit'}
P5 = {'Nombre': 'Gimli', 'Clase': 'Guerrero', 'Raza': 'Enano de  las Montañas Azules'}
P6 = {'Nombre': 'Boromir', 'Clase': 'Guerrero', 'Raza': 'Dúnadan'}

#Agregamos a la lista los personajes
personajes.append(P1)
personajes.append(P2)
personajes.append(P3)

#Imprimimos por consola
print(personajes)


