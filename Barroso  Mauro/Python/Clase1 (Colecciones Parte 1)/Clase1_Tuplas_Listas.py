#Ejercicio N° 1
#Dada la siguiente tupla

tupla = (13, 1, 8, 3, 2, 5, 8)

#Crear un alista que solo incluya los numeros menores a 5 e imprima por consola [1, 3, 2]

lista = [] #Definimos la lista
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)
#Ejecutamos
