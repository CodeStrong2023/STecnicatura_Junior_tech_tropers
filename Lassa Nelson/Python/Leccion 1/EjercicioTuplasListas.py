# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8)  # Definimos la tupla
# Crea una lista que solo incluya los números menores a 5
# e imprima por consola [1,3,2]
lista = []
for num in tupla:
    if num < 5:
        lista.append(num)

print(lista)