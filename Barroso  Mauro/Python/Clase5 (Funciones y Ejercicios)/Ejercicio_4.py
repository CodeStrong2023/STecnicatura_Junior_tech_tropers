#Ejercicio 4: Sumar números pares dentro de un rango
#Hacer u programa para sumar números pares dentro de un rango ej:
#suma de númerospares del 2 al 30
#suma = 240
inicio = int(input("Indique desde dónde quiere iniciar la suma: "))
fin = int(input("Indique hasta dónde quiere sumar: "))
suma = 0
for i in range(inicio, fin + 1):
    if i % 2 == 0:
        suma += i
print(f"\nLa suma de los números pares es: {suma}")