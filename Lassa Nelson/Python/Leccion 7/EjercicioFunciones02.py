# Ejercicio 2: Función con * args para multiplicar
# Crear una función para multiplicar los valores recibidos
# de tipo numérico, utilizando argumentos variables * args
# como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumentos

def multiplicar(*args):  # Definimos que se recibiran n cantidad de parametros
    print(args)
    resultado = 1
    for i in args:
        resultado *= i
    return resultado


# Solicitaremos que ingresen los elementos para ser multiplicados

cant = int(input("Ingrese la cantidad a numeros a multiplicar: "))
print(cant)
lista = [] # Creamos una lista para almacenar los numeros a trabajar
for i in range(cant):
    numero = float(input(f"Ingrese el numero {i+1}: "))
    lista.append(numero) # Guardamos o agregamos el numero en la lista

# Llamamos a la funcion para realizar la multiplicacion
resultado = multiplicar(*lista)
print(f"El resultado de la multiplicación de {lista} es:", resultado )

# Forma del profe
print("Forma del profe",multiplicar(3,5,6))
