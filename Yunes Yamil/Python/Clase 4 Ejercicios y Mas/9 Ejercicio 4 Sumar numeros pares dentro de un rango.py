# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro
# de un rango, por ejemplo:
# suma de numeros pares del 2 al 30
# suma = 240

a = int(input("Digite de donde va a comenzar la suma: "))
b = int(input("Digite hasta dónde quiere llegar a sumar: "))
suma = 0

for i in range(a,b+1):
    if i % 2 == 0: # Si el numero es par...
        suma += i
print(f"\nLa suma de nùmeros pares dentro del rango es: {suma}")