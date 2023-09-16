# Ejercicio 2: Modificar los elementos de una lsita
# Llenar una lista con los números de 1 al 10, luego modificar
# los elementos de la lista multiplicándolos por un valor ingresado por el usuario

lista = list(range(1,11))
print("Lista Original")
for i in lista:
    print(i, end='-')
valor = int(input('\nDigite un valor a multiplicar: '))
# Multiplicamos todos los elementos de la lista
for indice, i in enumerate(lista): # Funcion para modificar los indices de la lista
    lista[indice] *= valor # El interador solo recorre los indices, en esta linea se multiplica

print(f'Lista final con los elementos multiplicados por {valor}')
for i in lista:
    print(i,end='-')
