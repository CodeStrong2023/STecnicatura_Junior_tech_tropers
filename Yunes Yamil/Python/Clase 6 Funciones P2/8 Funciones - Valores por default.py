# Creamos una funcion
def sumar2(a = 0,b = 0): # Le damos valores por default para que no haya error
    return a + b
resultado = sumar2()
print(f'Resultado de la suma: {resultado}')

print('Le asignamos argumentos: _______ a=22 y b=66')
print(f'Resultado de la suma: {sumar2(22,66)}')