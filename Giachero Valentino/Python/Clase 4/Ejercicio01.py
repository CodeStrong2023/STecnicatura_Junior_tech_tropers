#Ejercicio1: Llenar una lista
#Llenar con los números del 1 al 50, y mostrar
#La lista con bucle for, los números debe mostrarse en forma ascendete y de corrido

#lista = []# creacion de lista vacía
#i = 1
#while i <= 50: #condición
#    lista.append(i)
#    i += 1 #incrementamos el iterador
lista = list(range(1, 51)) #mismo código en una sola línea
for i in lista:
    print(i, end='-')