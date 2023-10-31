#Ejercicio 1: No repetir caracteres
#Hacer un programa que pida una cadena por teclado, luego
#meter los caracteres en una lista sin repetir caracteres

# Solicita al usuario ingresar una cadena
cadena = input("Ingresa una cadena: ")

# Crea un conjunto vacío para almacenar caracteres únicos
caracteres_unicos = set()

# Itera a través de cada carácter en la cadena
for caracter in cadena:
    # Agrega el carácter al conjunto si aún no está presente
    caracteres_unicos.add(caracter)

# Convierte el conjunto de caracteres únicos de nuevo a una lista
lista_sin_repeticiones = list(caracteres_unicos)

# Imprime la lista resultante
print("Caracteres sin repetir:", lista_sin_repeticiones)
