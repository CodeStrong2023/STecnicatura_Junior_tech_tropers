class Aritmetica:
    """
    Crear una clase llamada resctangulo, debe tener 2 atruibutos: altura y base
    el nombre del metodo sera calcular el area utilizando la formula:
    area = base*altura. Pero la base y la altura deben ser ingresadas por el usuartio y losobjetos deben ser tres

    """
    def __init__(self, altura, base):

        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.altura * self.base


base = int(input('Ingrese el numero para la base del rectangulo: '))
altura = int(input('Ingrese el numero para la altura: '))
rectangulo1 = Rectangulo(base, altura)

print(f'El area del rectangulo es: {rectangulo1.calcular_area()}')

