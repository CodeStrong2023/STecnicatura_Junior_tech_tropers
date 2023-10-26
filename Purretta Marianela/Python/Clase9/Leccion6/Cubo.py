class Cubo:
    """
    Crear una clase Cubo con los atributos: ancho, alto y profundidad,
    con un método para calcular_volumen que tendrá la fórmula:
        volumen = ancho * alto * profundidad
    y que el usuario ingrese los valores
    """
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    #Método:
    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad

ancho = int(input('Ingrese el ancho del cubo: '))
alto = int(input('Ingrese el alto del cubo: '))
profundidad = int(input('Ingrese la profundidad del cubo: '))

cubo1 = Cubo(ancho, alto, profundidad)
print(f'El volúmen del cubo es: {cubo1.calcular_volumen()}')

