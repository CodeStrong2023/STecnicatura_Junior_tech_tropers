"""
Ejercicio 3: Insertar elementos y ordenarlos
Pedir numeros y meterlos en una lista, cuando el usuario introduzca un numero
0, nuestro programa dejaraia de insertar.
Por ultimo, mostrar los elementos ordenados de menos a mayor
"""

lista = []
salir = False
while not salir:
    numero = int(input("Ingrese un numero: "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)

lista.sort()  # Esta funcion ordena la lista
print(f"\n Lista ordenada: \n{lista}")