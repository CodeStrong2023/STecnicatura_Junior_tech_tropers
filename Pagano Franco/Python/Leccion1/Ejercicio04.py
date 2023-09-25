"""
Ejercicio 4: Sumar numeros pares dentro de un rago
Hacer un programa para sumar numeros pares dentro
de un rango, por ejemplo:
suma de numeros pares del 2 al 30.
suma = 240
"""

a  = int(input("Ingrese desde que valor comienza la suma: "))
b = int(input("Ingrese hasta que valor llega la suma: "))

lista = list(range(a,b+1))
suma = 0
for numero in lista:
    if numero % 2 == 0:
        suma += numero
print(f"La suma de los numeros pares del rango es: {suma}")
