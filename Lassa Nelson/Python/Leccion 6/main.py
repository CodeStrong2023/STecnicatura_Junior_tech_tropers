# Comenzamos con Funciones
# mi_funcion() # No se puede llamar antes de definir a una función
# Definimos una función
def mi_funcion():  # Para identificar a la función utilizamos parentesis
    print("Saludos a todos los alumnos de la Tecnicatura")


mi_funcion()  # Estamos llamando a la función
mi_funcion()  # Se puede llamar a una función N cantidad de veces


# Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name + " " + lastName)


person = ["Nelson", "Lassa"]  # Lista
show(person[0], person[1])  # Pasasmos uno por uno los datos de la lista a la función
show(*person)  # Esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ("Ezequiel", "Lassa")  # Desempaquetamos a traves de una tupla
show(*person2)
person3 = {
    "lastName": "Galvarini", "name": "Giancarlo"
}
show(**person3)  # Desempaquetar por elementos ;)

numbers = [1, 2, 3, 4, 5]  # Aun con la la lista vacia se va a ejecutar el else
for n in numbers:
    print(n)
    if n == 3:
        break  # Esta es la unica manera para que no se ejecute

else:
    print("Esto se termino")

# List comprehension, lista de comprensión
names = ["Nelson", "Ezequiel", "Exodier", "El Men"]
alongE = [e for e in names if e[0] == "E"]  # Esto regresa una nueva lista
print(alongE)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)


# Paso de Argumentos (funciones)
def mi_funcion2(name, lastName):  # Son parametros que debe recibir
    print("Saludos a todos que la miran por TV")
    print(f"Nombre: {name}, Apellido: {lastName}")


mi_funcion2("Nelson", "Lassa")  # Son los argumentos que envia
mi_funcion2("Gianca", "Galva")


# La palabra return en funciones
# Creamos una función para sumar
def sumar(a, b):
    return a + b


# resultado = sumar(15, 453)
# print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar(55, 45)}")


def sumar2(a=0, b=0):  # Valores por default
    return a + b


resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(22,15)}")


# Argumentos, variables en funciones
def listarNombres(*nombres): # Normalmente se utiliza: * args
    for nombre in nombres: # Se convierte en una tupla
        print(nombre)
listarNombres("Nelson","Ezequiel", "Valentin", "Emanuel", "Jose")
# No reescriben solo se añaden
listarNombres("Marcos", "Daniel", "Mariano", "Raul", "Viviana", "Graciela")