#Ejercicio1: Eliminar duplicados de una lista
#Escribir un programa donde tenga una lista y que a continuación
#elimine los elementos repetidos, y al final mostrar la lista

#Creamos la lista:
lista = [1,2,3,4, "Marianela", "Emir", "Sahir", 4, 3, 5, 2, "Emir"]
lista = list(set(lista))
#pasamos la lista a conjunto para que elimine los repetidos
#convertimos el conjunto a una lista
print(lista)
