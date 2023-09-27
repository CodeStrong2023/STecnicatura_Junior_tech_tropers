#Ejercicio 5: Factorial de un número positivo
#Hacer un programa para calcular el factorial de un número positivo

#Pedimos un número al usuario
num = int(input("Digite un número: "))

#Mientras el número sea menor a 0 nos solicitará otro número
while num <0:
    print("Error => El número debe ser positivo")
    num = int(input("Digite otro número: "))

factorial = 1 #La variable para calcular el factorial
#Recorremos el rango con un ciclo for
for i in range(1,num + 1):
    factorial *= i
#Mostramos por pantalla los resultados
print(f"El factorial del número {num} positivo ingresado es: {factorial}")