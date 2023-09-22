#Ejercicio 6: TABLA DE MULTIPLICAR:
#Hacer un programa que pida un número por teclado y guarde
#en un lista su tabla de multiplicar hasta 10.

numero = int(input('Ingrese un número: '))
lista = []
for i in range(1, 11):
    lista.append(i * numero)

print(f'\nLa tabla de multiplicar del {numero} es: \n {lista}')

for indice, i in enumerate(lista):
    print(f'{numero} x {i} = {lista[indice]}')