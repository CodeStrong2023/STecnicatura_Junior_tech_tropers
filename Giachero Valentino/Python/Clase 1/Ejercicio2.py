# Dada la siguiente tupla
tupla = (13,1 ,8 ,3 ,2, 5,8)

#Crear una lista que solo incluya los números menores a 5
# e imprima por consola[1,3,2]

lista = [] #Definimos fila lista
#Filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)