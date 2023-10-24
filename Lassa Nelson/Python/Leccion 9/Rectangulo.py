class Rectangulo:
    """
    Crear una clase llamada Rectangulo, debe tenér 2 atributos: altura y base
    el nombre del métod sera calcular_area utilizando la formula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por
    el usuario y los objetos deben ser tres.
    """

    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    # Creamos el metodo de calcular area
    def calcular_area(self):
        return self.base * self.altura


rectangulo1 = Rectangulo(int(input("Ingrese base: ")), int(input("Ingrese altura: ")))
print(f"El area del rectangulo es: {rectangulo1.calcular_area()}")

rectangulo2 = Rectangulo(int(input("Ingrese base: ")), int(input("Ingrese altura: ")))
print(f"El area del rectangulo es: {rectangulo2.calcular_area()}")

rectangulo3 = Rectangulo(int(input("Ingrese base: ")), int(input("Ingrese altura: ")))
print(f"El area del rectangulo es: {rectangulo3.calcular_area()}")

# Forma del profe

base = int(input("Ingrese el número para la base de rectangulo: "))
altura = int(input("Ingrese el número para la altura de rectangulo: "))
rectangulo1 = Rectangulo(base, altura)
print(f"El area del rectangulo es: {rectangulo1.calcular_area()}")
