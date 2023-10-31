from Persona2 import Persona2 #importamos la clase Persona2
print('Creación de objetos'.center(25, '-'))
if __name__ == '__main__':
    persona5 = Persona2('Vale', 'Gomez', 20)
    persona5.mostrar_detalles() #Muestra todos los objetos y dela clase

    print(__name__) #para ver hasta donde se esta ejecutando un código u otro

print('Eliminación de objetos'.center(50,'-'))# 50 y - es para centrar la cadena
del persona5
