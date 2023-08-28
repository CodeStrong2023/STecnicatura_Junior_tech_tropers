"""
Ejercicio 1: Iterar un rango de 0 a 10 e imprimir números divisibles entre 3
Ejemplo de la ejecocion: 0, 3, 6, 9
"""
print("Con una lista de 0 a 10")
arreglo = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

for elemento in arreglo:
    if elemento % 3 == 0:
        print(elemento)
print("Con la variable range")

for elemento in range(11):
    if elemento % 3 == 0:
        print(elemento)

"""
Ejercicio 2: Crea un rango de numeros de 2 a 6 e imprimelos
Ejemplo de ejecución: 
"""

print("Con la variable range")

rango = range(2, 7)
for elemento in rango:
    print(elemento)

"""
Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2 en ligar de 1 en 1 
Ejemplo de ejecución: 3,5,7,9
"""
print("rango de 3 a 10")

rango = range(3, 11)

for y in rango:
    if y % 2 == 1:
        print(y)

"""Este es paso a paso"""
rango = range(3, 11)

for y in rango:
    if y % 2 == 1:
        print(y)
