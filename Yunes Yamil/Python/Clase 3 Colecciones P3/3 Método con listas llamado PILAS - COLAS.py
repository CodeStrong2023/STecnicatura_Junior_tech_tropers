# ********** PILAS USANDO LISTAS *****************
print('*** Pila inicial: ')
pila = [1,2,3]

# Agregar elementos a la pila por el final

print("*** Agregamos un nuevo elemento, y luego otro")
pila.append(4)
pila.append(5)

print("*** Nuestra pila queda asi: ")
print(pila)
# Siempre los elementos se van agregando al final

#Sacando filas desde el final

print("*** Extraemos el ultimo elemento con funcion pop: ")
elementoBorrado = pila.pop() # Pop quita el ultimo elemento y lo guarda en la variable
print(f'Sacamos el último elemento {elementoBorrado}')
print(f'La pila ahora queda asi: {pila}')

# ********** PILAS USANDO COLAS *****************

# Estructura de datos de tipo FILO (first input / first output)
print('*** Definimos una cola: ')
cola = ['Ariel','Osvalo','Liliana','Pilar']

# Agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('Jose')
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

