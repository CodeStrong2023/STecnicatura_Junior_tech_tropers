# Definimos una funcion

def listarTerminos(**terminos): # Lo mas utilizado es **kwargs para recibir los argumentos
    for llave, valor in terminos.items(): # kwargs singnifica: key word argument
        print(f'{llave}:{valor}')

listarTerminos() # Nada se va a mostrar
listarTerminos(IDE = 'Integratred Development Enviroment', PK = 'Primary Key')
listarTerminos(Nombre = 'Lionel Messi')

