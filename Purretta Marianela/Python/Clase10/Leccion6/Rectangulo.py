class Rectangulo:
    """
    Crear una clase llamad Rectangulo, debe tener 2 atributos: alto y base
    el nombre del método será calcular área usando la fórmula: area = base*altura.
    Pero la base y la altura deben ser ingresadas por el usuario y los objetos deben ser tres
    """
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    #Método
    def calcular_area(self):
        return self.altura * self.base

base = int(input('Ingrese la base del rectángulo: '))
altura = int(input('Ingrese la altura del rectángulo: '))

rectangulo1 = Rectangulo(base, altura)
print(f'El área del rectángulo es: {rectangulo1.calcular_area()}')