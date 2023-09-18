#Ejercicio 5: Modificar los elementos de una lista
#Llenar una lista con los números del 1 al 10 , luego modificar los
#elementos de la lista multiplicandolos por un valor ingresado por el usuario

lista = list(range(1, 11))
for i in lista:
    print(i, end = '-')

num = int(input("Digite un numero: "))
#Multiplicamos todos los elementos de la lista
for indice, i in enumerate(lista):
    lista[indice] *= num

print(f'Multiplicación de los elementos de la lista por el número {num}')
for i in lista:
    print(i, end='-')
