class Rectangulo:
    """
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base
    el nombre del metodo sera calcular area utilizando la formula:
    area = base * altura. Pero la base y la altura deben ser ingresadas
    por el usuario y los objetos ser tres
    """
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    # Metodo para sumar
    def area(self):
        return self.base * self.altura


base = int(input("Ingrese el valor de la base: "))
altura = int(input("Ingrese el valor de la altura: "))
rectangulo1 = Rectangulo(altura, base)  # Le pasamos los argumentos para los operadores
print(rectangulo1.area())