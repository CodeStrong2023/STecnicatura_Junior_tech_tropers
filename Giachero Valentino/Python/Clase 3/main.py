#Repaso de set o conjunto
# para definir un conjunto
conjunto = set()
conjunto1 = {'Hola'}
conjunto.add(7)
conjunto.add('HOLA')
print(conjunto)
conjunto1.add(9)
print(conjunto1)
#Verificación si se encuentra un valor
print(3 not in conjunto1)

#Hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto) #Nos devuelve como respuesta un booleano

#Operaciones en conjunto
conjunto3 = conjunto1 | conjunto #La línea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto #Vemos el elemento que tienen en común
print(conjunto3)

conjunto3 = conjunto1 - conjunto #Asigna el valor que esta en el conjunto1 y no en el conjunto2
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto #Son los elementos que están en los dos conjuntos y no compartidos
print(conjunto3)

conjunto3 = conjunto1 | conjunto
print(conjunto1.issubset(conjunto3)) #Aquí preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))

print(conjunto3.issuperset(conjunto1)) #Preguntamos si los elemntos del conjunto1 estan dentro del conjunto 3
print(conjunto3.issuperset(conjunto)) #Si es verdadero quiere decir que el conjunto3 es un superconjunto
print(conjunto.issuperset(conjunto3))

#Cómo saber si ambos conjuntos son disconexos, esto quiere decir si no comparten elementos en común
print(conjunto1.isdisjoint(conjunto)) # No hay cosas en comun

#Convertir un conjunto en inmutable
conjunto1 = frozenset #Esto hace que el conjunto sea inmutable

#Repaso de diccionarios
diccionarioNuevo = {'Azul' : 'Blue', 'Rojo' : 'Red', 'Verde' : 'Green', 'Amarillo' : 'Yellow'}
print(diccionarioNuevo)

#Cómo eliminar
del(diccionarioNuevo['Azul'])
print(diccionarioNuevo)

#Los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {'Ariel':{'Edad':40, 'Altura': 1.83}, 'Osvaldo': [45,1.85], 'Natalia' :[35,1.67]}
print(diccionario2)

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad':36,'Altura':1.70,'Precio':'50 Millones', 'Posición': 'Delantero'},
    11: {'Nombre': 'Di María', 'Edad':34,'Altura':1.80,'Precio':'12 Millones', 'Posición': 'Delantero'},
    24: {'Nombre': 'Tu Abuelo', 'Edad':86,'Altura':1.80,'Precio':'500 Millones', 'Posición': 'Delantero'}

}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

#Pilas usando listas
pila = [1,2,3]

#Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

#Sacamos elementos desde el final
elementoBorrado = pila.pop() #Asignamos a la variable elementoBorrado el elemento que eliminamos
print(f'Sacamaos el elemento: {elementoBorrado} y la pila quedó así: {pila}')

#Colas con listas
#Estructuras de datos de tipo fifo(first input / first output
cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

#Agregar elementos al final de la cola
cola.append('Mariela')
cola.append('Juan')
print(cola)

#Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atendido: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido: {seRetira}')
print(cola)