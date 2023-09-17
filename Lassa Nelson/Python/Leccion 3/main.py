# Repaso de set o conjunto
# para definir un conjunto
conjunto = set()
conjunto1 = {"bye", }
conjunto.add(7)
conjunto.add("Hola")
print(conjunto)

conjunto1.add("Hola")
print(conjunto1)
print(3 not in conjunto1)  # Pregutamos si el número 3 "NO" esta en el conjunto1

# Como hacer la igualdad de dos conjuntos
print(conjunto == conjunto1)  # Nos devuelve como respuesta un booleano

# Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto  # La línea une los 2 conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto  # Que elelemtos tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto  # Ver los conjuntos que solo estan en el conjunto 1 y no estan en el conjunto
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto  # Son los elementos que estan en los 2 conjuntos pero no estan compartidos
print(conjunto3)

# Repaso Diccionarios
diccionarioNuevo = {"Azul": "Blue", "Rojo": "Red", "Verde": "Green", "Amarillo": "Yellow"}
print(diccionarioNuevo)

# Como eliminar
del (diccionarioNuevo["Azul"])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferente tipos de datos
diccionari2 = {"Nelson": {"edad": 29, "Altura": 1.64}, "Franco": [26, 1.75], "Ivo": [29, 1.78]}
print(diccionari2)

seleccionArgentina = {
    10: {"Nombre": "Lionel Messi", "Edad": 36, "Altura": 1.70, "Precio": "50 Millones", "Posicion": "Extremo Derecho"},
    11: {"Nombre": "Angel Di Maria", "Edad": 35, "Altura": 1.80, "Precio": "12 Millones",
         "Posicion": "Extremo Derecho"},
    21: {"Nombre": "Paulo Dybala", "Edad": 29, "Altura": 1.77, "Precio": "35 Millones", "Posicion": "Delantero"},
    19: {"Nombre": "Nicolas Otamendi", "Edad": 35, "Altura": 1.83, "Precio": "3.5 Millones",
         "Posicion": "Defensa Central"},
    1: {"Nombre": "Franco Armani", "Edad": 36, "Altura": 1.89, "Precio": "3.5 Millones", "Posicion": "Portero"},
    23: {"Nombre": "Damian Emiliano Martinez", "Edad": 31, "Altura": 1.195, "Precio": "28 Millones",
         "Posicion": "Portero"},
    5: {"Nombre": "Leonardo Daniel Paredes Benitez", "Edad": 29, "Altura": 1.82, "Precio": "6 Millones",
        "Posicion": "Centro Campista"},
    7: {"Nombre": "Rodrigo Javier de Paul", "Edad": 29, "Altura": 1.77, "Precio": "37 Millones",
        "Posicion": "Centro Campista"},
    20: {"Nombre": "Alexis Mac Allister", "Edad": 24, "Altura": 1.74, "Precio": "40 Millones",
         "Posicion": "Centro Campista"}
}

print(seleccionArgentina)
print(seleccionArgentina[10])
print(seleccionArgentina.values())

# De esta manera recorre y muestra todo el diccionario
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

print("Tenemos cargados en el diccionario la cantidad de jugadores: ", end=" ")
print(len(seleccionArgentina))

# Pilas usando listas
pila = [1, 2, 3]

# Agrefar elementos a la pila
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos desde el final
elementoBorrado = pila.pop() # Quita el último elemento y lo guarda en la variable
print(f"Sacamos el elemento {elementoBorrado}")
print(f"La pila ahora quedo asi: {pila}")

# Colas con listas
# Estructura de datos tipo fifo(first input / first output)
cola = ["Nelson", "Mariano", "Valentin", "Jose", "Daniela"]

# Agregamos elementos al final de la cola
cola.append("Adara")
cola.append("Sofia")
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f"Atendido {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido {seRetira}")
print(cola)

