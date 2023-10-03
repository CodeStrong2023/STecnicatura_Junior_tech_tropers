# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10. Por ejemplo:
# Si digita el 5 la lista tendra: 5, 10, 15, 20, 25, 30, 35, 40, 45, 50

numero= int(input("Ingresa la tabla que desees conseguir: "))
tabla = 1
lista = []
for i in range(1,11):
    tabla = i*numero
    lista.append(tabla)

print(f"\nTabla de multipicar del {numero}: \n{lista}")

for indice,i in enumerate(lista):
    print(f"{numero} x {i} = {lista[indice]}") # Este ciclo es para ver el formato de una tabla de multiplicar