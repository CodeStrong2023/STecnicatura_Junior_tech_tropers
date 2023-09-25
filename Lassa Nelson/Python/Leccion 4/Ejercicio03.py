# Ejercicio 3: Insertar elementos y ordenarlos
# Pedir número y meterlos en una lista, cuando el usuario
# introduzca un número 0, nuestro programa dejaria de insertar
# Por último, mostrar los número ordenados de menor a mayor

lista = []
salir = False
while not salir:
    numero = int(input("Digite un número: "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
lista.sort() # La lista esta ordenada con esta función
print(f"\nLista ordenada: \n{lista}")