#Ejercicio 3: Insertar elementos y ordenarlos
#Pedir números y meterlos en una lista, cuando el usuario introduzca 0
#el programa dejaría de insertar números y al final, mostrar los números de menor a mayor
lista = []
salir = False #Creamos una bandera la inicializamos en F
while not salir: #Mientras sea verdadero:
     numero = int(input('Ingrese un número: '))
     if numero == 0:
         salir = True #Si ingresa 0 sale del programa
     else: #sino agrega a la lista
         lista.append(numero)
# funcion para ordenar:
lista.sort()
print(f'\nLista ordenada: \n{lista}')