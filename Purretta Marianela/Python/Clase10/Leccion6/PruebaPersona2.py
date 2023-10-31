from Persona2 import Persona2 #importamos la clase Persona2
print('Creación de objetos'.center(50, '-'))
if __name__ == '__main__':
    persona5 = Persona2('Lucía', 'Arauz', 54)
    persona5.mostrar_detalles() #Muestra todos los objetos y dela clase

    print(__name__) #para ver hasta donde se esta ejecutando un código u otro

print('Eliminación de objetos'.center(50,'-'))# 50 y - es para centrar la cadena
del persona5