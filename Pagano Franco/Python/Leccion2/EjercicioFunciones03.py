"""
Ejercicio 3: Funcion Recursiva
Imprimir numeros de 5 a 1 de manera descendicente usando funciones recursivas
puede ser cualquer valor positivo, por ejemplo, si pasamos el
valor 5, debe imprimir:
5
4
3
2
1
En caso de ser el numero 3 debe imprimir:
3
2
1
Si se ingresa un numero negativo no debe de imprimir nada
"""

def funcionDescendiente(numero):
        if numero >= 1:  # Caso Base
            print(numero)
            return funcionDescendiente(numero - 1)  # Caso recursivo
        elif numero <= 0:
            print("Ingrese un valor positivo")



numeroIngresado = int(input("Ingrese un numero: "))
print(f"Los valores descendientes de {numeroIngresado} son:")
resultado = funcionDescendiente(numeroIngresado)
