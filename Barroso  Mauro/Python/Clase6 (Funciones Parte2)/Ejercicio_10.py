#Ejercicio 10: No repetir caracteres, hacer un programa que pida una cadena por teclado, luego meter los caracteres en una lista sin repetir caracteres

cadena = input('Ingrese un texto: ')
lista = []
for i in cadena:
    if i not in lista:
        lista.append(i)
print(f'\nLista de caracteres sin repetir: \n {lista}')