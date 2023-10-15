# Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# ingresar los caracteres en una lista sin repetir caracteres.

cadena = input('Digite una cadena: ')
lista = []
for i in cadena:
    if i not in lista: # Si el caracter aún no está en la lista
        lista.append(i) # Lo agregamos a la lista
print(f'\nLista de caracteres sin repetir ninguno: \n{lista}')