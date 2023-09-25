import math  # Importamos la clase math para hacer uso de la función sqrt(raiz cuadrada)

numero = int(input("Digite un numero positivo "))
while numero < 0:
    print("Error -> deberia ser un numero ")
    numero = int(input("digite un numero poositivo "))
print(f"\nSu raíz cuadrada es: {math.sqrt(numero):.2f}")

# Retomamos el diccionario usado en la clase anterior
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

# Forma de recorrer un diccionario
for i in seleccionArgentina:
    print(f"{i}->{seleccionArgentina[i]}")