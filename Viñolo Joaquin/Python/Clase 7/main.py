#Clase 7 Python

def listarTerminos(**terminos): #Lo más utilizado es **Kwargs para recibir los argumentos
    for llave, valor in terminos.items(): #kwargs significa: key word argument
        print(f"{llave}:{valor}")


listarTerminos()
listarTerminos(IDE = "Integrated Develoment Enviroment", PK = "Primary Key")
listarTerminos(Nombre = "Leonel Messi")

#Definimos una función desplegarNombres
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ["Tito", "Pedro", "Carlos"]
desplegarNombres(nombres2)
desplegarNombres("Carla")
desplegarNombres((10,11)) #Convertimos en una tupla
desplegarNombres([22,55]) #La convertimos en una lista

#Funciones recursivas
def factorial(numero):
    if numero == 1: #Caso base
        return 1
    else:
        return numero * factorial(numero -1) #Caso recursivo
numeroFactorial = int(input("Digite un número: "))
resultado = factorial(numeroFactorial) #Lo hacemos con el codigo duro
print(f"El factorial del número 5 es: {resultado}")

