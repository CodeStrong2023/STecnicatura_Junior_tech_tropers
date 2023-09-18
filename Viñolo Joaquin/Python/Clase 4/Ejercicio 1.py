#Ejercicio 1: Eliminar duplicados de una lista
#Escriba un programa donde tenga una lista y que a continuación
#elimine los elementos repetidos, por último mostrar la lista
#Creamos una lista

lista = [1,2,3,4,5,5,6,7,7] #Esto es una lista

# Crear la lista
listaSinDuplicados = []

# Eliminar duplicados utilizando un conjunto set
listaSinDuplicados = list(set(lista))

# Mostrar la lista sin duplicados
print(listaSinDuplicados)



