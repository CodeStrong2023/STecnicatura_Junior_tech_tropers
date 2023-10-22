# Para recibir una lista de terminos
# **kwargs (key word argument) para recibir un diccionario comppleto
# **terminos
def listaTerminos(**terminos):
    for llave, valor in terminos.items():
        print(f"{llave} : {valor}")


listaTerminos()  # no recibe nada, nada se va a mostrar
listaTerminos(IDE="Integrated Develoment Enviroment",
              PK="Primeruy Key")
listaTerminos(Nombre="Leonel Messi")


def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)


nombres2 = ["Loco", "Cuerdo", "Flojo"]
desplegarNombres(nombres2)
desplegarNombres("Chicho")
# desplegarNombres(10) # No es un objeto iterable
desplegarNombres((10, 11))  # Lo convertimos en una tupla
desplegarNombres((10,))  # Lo convertimos en una tupla un solo elemento no olvidar la COMA

desplegarNombres([10, 12])  # Lo convertimos en una lista


# Funciones Recursivas
def factorial(numero):
    if numero == 1:  # caso base

        return 1
    else:
        return numero * factorial(numero - 1)  # caso Recursivo


resultado = factorial(5)  # Lo hacemos en código duro
print(f"El factorial del número 5 es: {resultado}")

# Pedir al usuario que ingrese el numero a realizarle el factorial
pido = float(input("\tIngrese el numero para encontrar su factorial: "))
resultado = factorial(pido)
print(f"\n\t\tEl factorial del número {pido} es: {resultado}")
