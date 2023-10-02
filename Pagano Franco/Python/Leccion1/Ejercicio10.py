"""
Ejercicio 10: No repetir caracteres
Hacer un programa que pida una cadena por teclado, luego
meter los caracteres en una lista sin repetir caracteres
"""
lista = [] # Definimos una lista vacia
lista2 = []

# Le pedimos al usuario que ingrese una oracion
oracion = input("Ingrese una oracion: ")

# Descomponemos la oracion para almacenarla en la lista
for caracter in oracion:
    # Segun yo
    # Pero con la condicion de que si el caracter esta repetido, no lo almacene
    if lista.count(caracter) == 0:
        lista.append(caracter)

    # Segun el profe
    if caracter not in lista2:
        lista2.append(caracter)

print(f"lista de caracteres sin repetir: \n {lista}")
print(f"lista de caracteres sin repetir: \n {lista2}")