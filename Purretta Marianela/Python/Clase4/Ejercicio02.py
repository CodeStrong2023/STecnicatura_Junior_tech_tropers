#Ejercicio 2: Modificar los elementos de una lista
#Llenar una lista con números del 1 al 10, luego modificar los elem
#de la lista multiplicándolos por un valor ingresado por el usuario
lista = list(range(1, 11))
print('Lista Original')
for i in lista:
    print(i, end='-') #mostramos la lista de corrido
valor = int(input('\nIngrese un número para multiplicar: '))
for indice, i in enumerate(lista): # usamos la función para que trabaje con los índices y los manipule y multiplique
    lista[indice] *= valor #realizamos la operación de multiplicar en los índices
print(f'Lista final con los elementos ya multiplicados por {valor}')
for i in lista:
    print(i, end='-')
