# Ejercicio 3: Insertar elementos y ordenarlos
# Pedir numeros e ingresarlos en una lista, cuando el usuarui
# introduzca un numero 0, nuestro programa dejaría de insertar.
# Por último, mostrar los numeros ordenados de menor a mayor.

lista = []
salir = False
while not salir:
    numero = int(input('Digite un número: '))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
lista.sort() # La lista esta ordenada con esta funcion
print(f'\nLista ordenada: \n{lista}')

