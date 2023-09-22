#Ejercicio 5: Factorial de un número positivo:
#Hacer un programa para calcular el factorial de un número positivo

num = int(input("Ingrese un número: "))
while num < 0:
    print("Número negativo!! Debe ingresar un número positivo")
    num = int(input("Ingrese un nuevo número: "))
factorial = 1
for i in range(1, num+1):
    factorial *= i
print(f"\nEl factorial del número {num} ingresado es : {factorial}")