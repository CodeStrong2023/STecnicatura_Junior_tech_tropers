# Desempaquetado de listas o list unpacking

def show (name, lastName):
    print(name+' '+lastName)
person = ["Yamil Jesus","Yunes"]
show(person[0],person[1]) # Pasamos uno por uno los datos de la lista
show(*person) # Es lo mismo que lo anterior, pero le pasamos todo junto

# con tuplas
person2 = ("Ariel","Betancud") # desempaquetamos a traves de una tupla
show(*person2)
person3 = {"lastName": "Lucero","name": "Natalia"}
show(**person3)