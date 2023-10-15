# Argumentos, variables en funciones
def listarNombres(*nombres): # Normalmente se utiliza: *args
    for nombre in nombres: # Se va a convertir en una tupla
        print(nombre)
listarNombres('Lucas','Jose','Claudia','Rosa','Maria')
listarNombres('Marcos','Daniel','Romina','Carlos')
# Los argumentos se acumulan
