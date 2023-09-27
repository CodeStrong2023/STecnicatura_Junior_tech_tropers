#Ejercicio10: No repetir caracteres
#Hacer un programa que pida una cadena por teclado, luego meter los
#caracteres en una lista sin repetir caracteres

texto = input('Escriba un texto: ')
lista = []
for i in texto:
    if i not in lista:
        lista.append(i)
print(f'\nLista de caracteres sin repetir: \n {lista}')
