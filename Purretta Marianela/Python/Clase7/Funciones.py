#FUNCIONES:
#mi_función()//Una función no puede llamarse antes de definirla
#Definimos la función:
def mi_funcion(): #Para identificar a la función usamos ()
    print('Saludos a todos')

mi_funcion() #Llamamos a la función
mi_funcion() #N cantidad de veces

#DESEMPAQUETADO DE LISTAS O LIST UNPACKING
#creamos un función:
def show(name, lastname):
    print(name+' '+lastname)
persona = ["Marianela", "Purretta"]
show(persona[0], persona[1])#pasamos los datos de la lista a la funcion de a uno
show(*persona)#pasamos los datos de la lista ala funcion pero todos a la vez
#Se utiliza también en tuplas:
persona2 = ("Sebastián", "Siri")
show(*persona2)
#Se utiliza también en diccionarios:
persona3 = {"Siri", "Emir"}
show(*persona3)

# REPASO FOR - ELSE
numbers = [1, 2, 3, 4, 5] # se crea la lista
for n in numbers: # Se recorre la lista
    print(n)
else:
    print('Esto se termino') # muestra la lista - else siempre se ejecuta aún con lista vacía

#LISTA DE COMPRENSION:
#tomar solo lo necesario sin modificar una lista
names = ['Paolo', 'Rodrigo', 'Lupe', 'Pepe']
alongP = [p for p in names if p[0] == 'P'] # Si los elem desde 0 en adelante es igual a P crea
#una nueva lista donde se guarda alongP
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"}
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

#PASO DE ARGUMENTOS (funciones)
def mi_funcion2(name, lastname):
    print("Saludos a todos de nuevo en funcón2") #parámetros -variables que declaremos a la funcion
    print(f'Nombre: {name}, Apellido: {lastname}')
mi_funcion2('Jorge', 'Lucero') # arguentos -valores que enviamos a la funcion
mi_funcion2('Ariel', 'Betancud')
mi_funcion2('Analía','Pedrosa')

#RETURN EN FUNCIONES
#creamos una función para sumar:
def sumar(a, b):
    return a + b # vamos a retornar el resultado
resultado = sumar(78, 22)
#print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55, 45)}')

def sumar2(a: int = 0, b: int = 0)-> int: # Le damos un valor por default
    return a + b
resultado = sumar2()
print(f'EL RESULTADO ES: {resultado}')
print(f'Resultado de la suma: {sumar2(22, 66)}')#Cdo pasamos un valor el valor por default se altera

#ARGUMENTOS, VARIABLES EN FUNCIONES
def listarNombres(*nombres): #*nombres: es la formapara que varíen los argumentos cdo no
# sabemos cuántos vamos a cargar aunque normalmente se usa "*args"
    for nombre in nombres: #La var nombres se convierete en un tupla
        print(nombre)
listarNombres('Lucas', 'José', 'Claudia', 'Rosa', 'María')
listarNombres('Marcos', 'Daniel', 'Romina', 'Rosario', 'Marianela')# cada vez que llamamos a la función
#podemos seguir agregando elementos

#definimos nueva función
def listarTerminos(**terminos): #aquí no usamos args pero tambien se puede usar **kwargs que es el más usado
    for llave, valor in terminos.items(): #kwargs: key word argument
        print(f'{llave} : {valor}')

listarTerminos() #No muestra nada, no tiene parámetros
listarTerminos(IDE='Integrated Develoment Enviroment', PK='Primary Key')
listarTerminos(Nombre='Leonel Messi') #si se tiene que pasar varios parámetros a la función primero
#es mejor de manera independiente

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ['Marianela', 'Sebastián', 'Emir', 'Sahir']
desplegarNombres(nombres2) #Lo recorre todo como una lista
desplegarNombres('Siri') #Lo muestra como una cadena
#desplegarNombres(23, 5) #no es un objeto iterable por eso tira error
#podemos lograr que se recorra convirtiendolo con (()) a tupla
desplegarNombres((10, 11))#para que lo acepte como tupla de estar el primer valor y coma((10,)) aunque sea un solo elem
desplegarNombres([22, 55]) #también convirtiéndolo en una lista podemos recorrerlo

#FUNCIONES RECURSIVAS
#TAREA: Pedir que el usuario ingrese el número para calcular su factorial
numero = int(input('Ingrese un número para calcular: '))
def factorial(numero):
    if numero == 1: #Caso base
        return 1
    else:
        return numero * factorial(numero-1) #Caso recursivo
resultado = factorial(numero) # hacemos la funcion resultado y le pasamos la func de fact
print(f'El factorial de {numero} es: {resultado}')




