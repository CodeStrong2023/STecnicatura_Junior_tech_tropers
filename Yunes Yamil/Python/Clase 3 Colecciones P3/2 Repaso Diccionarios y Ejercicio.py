# *** REPASO DICCIONARIOS ***

diccionarioNuevo = {'Azul':'Blue','Rojo':'Red','Verde':'Green','Amarillo':'Yellow'}
print(diccionarioNuevo)

# Como eliminar
print('Eliminamos un elemento del diccionario: ')
del(diccionarioNuevo['Azul'])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {'Yamil':{'edad':29, 'Altura':1.72}, 'Osvaldo':[45,1.85], 'Natalia':[35,1.67]}
print(diccionario2)

# *** SELECCION ARGENTINA ***
# Agregar mas jugadores y datos al diccionario

seleccionArgentina = {
    10:{'Nombre':'Lionel Messi', 'Edad':35,'Altura':1.70, 'Precio':'50 Millones','Posicion':'Extremo Derecho'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 Millones', 'Posicion': 'Extremo Derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 Millones', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolas Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 Millones', 'Posicion': 'Defensa'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 Millones', 'Posicion': 'Arquero'},
    23: {'Nombre': 'Emiliano Martinez', 'Edad': 31, 'Altura': 1.95, 'Precio': '28 Millones', 'Posicion': 'Portero'},
    27: {'Nombre': 'Julian Alvarez', 'Edad': 23, 'Altura': 1.70, 'Precio': '60 Millones', 'Posicion': 'Extremo Derecho'},
    20: {'Nombre': 'Alexis Mac Allister', 'Edad': 24, 'Altura': 1.76, 'Precio': '65 Millones', 'Posicion': 'Mediocampo'},
    24: {'Nombre': 'Enzo Fernandez', 'Edad': 22, 'Altura': 1.78, 'Precio': '121 Millones', 'Posicion': 'Mediocampo'},
    5: {'Nombre': 'Leandro Paredes', 'Edad': 29, 'Altura': 1.83, 'Precio': '12 Millones', 'Posicion': 'Mediocampo'},
    22: {'Nombre': 'Lautaro Martinez', 'Edad': 26, 'Altura': 1.75, 'Precio': '90 Millones', 'Posicion': 'Delantero centro'}

}

print(seleccionArgentina[10])

for llave, valor in seleccionArgentina.items():
    print(llave,valor)
print('*** Tamaño del diccionario: ')
print(len(seleccionArgentina))



