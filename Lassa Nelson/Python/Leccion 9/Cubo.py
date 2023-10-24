class Cubo:
    """
    Crear la clase Cubo con los atributos, ancho alto y profundidad,
    con método cacular_volumen que tendrá la formula:
    volumen = ancho * altura * profundidad
    que el usuario ingrese los valores.
    """

    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad

ancho = int(input("Ingrese el ancho del cubo: "))
altura = int(input("Ingrese la altura del cubo: "))
profundidad = int(input("Ingrese la profundidad del cubo: "))
cubo1 = Cubo(ancho,altura,profundidad)
print(f"El volumen del cubo es: {cubo1.calcular_volumen()} con las dimensiones {ancho}x{altura}x{profundidad}")