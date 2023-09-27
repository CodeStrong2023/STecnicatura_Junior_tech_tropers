#Ejercicio 6: Tabla de multiplicar
#Hacer un programa que pida un número por teclado y guarde
#En una lista su tabla de multiplicar hasta el 10.

#Solicitamos un número al usuario
num = int(input("Digite un número a multiplicar: "))
#Creamos una tabla vacía
listaDeTabla = []

i = 0
#Recorremos el rango de 0 a 10 para multiplicar el número
for i in range(0,11):
   listaDeTabla.append(i*num)

print(f"Tabla de multiplicar del número {num}: {listaDeTabla}")