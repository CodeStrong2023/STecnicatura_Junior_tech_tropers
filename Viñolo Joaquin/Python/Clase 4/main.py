#Sacar la raíz cuadrada de un número
#Importamos la clase math
import math

numero = int(input('Digite un numero positivo: '))
while numero < 0:
    print('Error: Digite un número positivo')
    numero = int(input('Digite un número positivo'))
print(f'Su raíz cuadrada es: {math.sqrt(numero):.2f}')

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad':36,'Altura':1.70,'Precio':'50 Millones', 'Posición': 'Delantero'},
    11: {'Nombre': 'Di María', 'Edad':34,'Altura':1.80,'Precio':'12 Millones', 'Posición': 'Delantero'},
    24: {'Nombre': 'Tu Abuelo', 'Edad':86,'Altura':1.80,'Precio':'500 Millones', 'Posición': 'Delantero'}

}

for i in seleccionArgentina:
    print(f'{i} -> {seleccionArgentina[i]}')