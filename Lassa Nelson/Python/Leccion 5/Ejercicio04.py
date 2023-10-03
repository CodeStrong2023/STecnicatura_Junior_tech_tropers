# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro
# da un rango, por ejemplo:
#                           suma de números pares del 2 al 30
#                           suma = 240

rangoI = int(input("Ingrese el rango de inicio: "))
rangoF = int(input("Digite el rango final: "))
suma = 0
for i in range(rangoI, rangoF + 1):
    if i % 2 == 0:  # Esto es si el numero es par
        suma += i
print(f"\nLa suma que se da en el rango ingresado es: {suma}")
