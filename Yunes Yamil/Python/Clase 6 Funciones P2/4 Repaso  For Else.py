# Creamos una variable, que sera una lista de numeros
numbers = [1,2,3,4,5]
for n in numbers:
    print(n)
else:
    print('Esto se terminó.')
    print()
# Si la lista no tuviera ningun valor

print('*** Si la lista no tiene ningun valor: ***')
# Creamos una variable, que sera una lista de numeros
numbers = [] #Aun con la lista vacia se ejecutara el else.
for n in numbers:
    print(n)
else:
    print('Esto se terminó.')
    print()

print('*** Evitamos que se ejecute el else con break en n=3: ***')
# Creamos una variable, que sera una lista de numeros
numbers = [1,2,3,4,5] #Aun con la lista vacia se ejecutara el else.
for n in numbers:
    print(n)
    if n == 3:
        break #Esta es la unica manera para que no se ejecute el else.
else:
    print('Esto se terminó.')
    print()