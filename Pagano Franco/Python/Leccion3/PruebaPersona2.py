from Persona2 import Persona2
print("Creacion de objetos".center(50, "-"))
if __name__ == '__main__':
    persona5 = Persona2("Lionel", "Messi", 36)
    persona5.mostrar_detalles()

    print(__name__)

print("Eliminacion de Objetos".center(50, "-"))
del persona5