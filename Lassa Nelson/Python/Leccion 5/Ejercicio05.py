# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un numero positivo

numero = int(input("Ingresa el numero que desea obtener el Factorial: "))
while numero < 0:  # Mientras el numero sea negativo
    print("Error -> el número tiene que ser positivo")
    numero = int(input("Ingresa un numero:"))
suma = 1
for i in range(1, numero + 1):
    suma *= i
print(f"El factorial de {numero} es: {suma}")
