# Definimos una funcion

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)

# creamos una lista
nombres2 = ['Tito', 'Pedro','Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10) No es un objeto iterable
desplegarNombres((10,11)) # La convertimos en una tupla
desplegarNombres([22,55]) # Lo convertimos en una lista