"""
Ejercicio 6: Tabla de multiplicar
Hacer un programa que pida por teclado y guarde
en una lista su tabla de multiplicar hasta el 10. Por ejemplo
Si digita el 5 la lista tendra: 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
"""
numero = int(input("Ingrese un numero para obtener su tabla de multiplicacion: "))
lista = list(range(1*numero,11*numero,numero))
print(f"La tabla de multiplicar de {numero} es: \n {lista}")

for i in range(1,11):
        print(f"{numero} * {i} = {lista[i-1]}")