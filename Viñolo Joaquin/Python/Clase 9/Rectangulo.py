"""
Crear una clase llamada Rectangulo
debe tener 2 atributos: altura y base
el nombre del método será calcular área utilizando la fórmula:
area = base*altura. Pero la base y la altura deben
ser ingresadas por el usuario y los objetos deben ser tres
"""
class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    #Método para calcular el área
    def area(self):
        return self.base * self.altura

#Pedimos los datos al usuario
base = int(input("Digite la base del rectangulo: "))
altura = int(input("Digite la altura del rectangulo:"))

#Instanciamos la clase Rectangulo
rectangulo = Rectangulo(base, altura)
#Mostramos por consola el resultado
print(f"El area del rectangulo es: {rectangulo.area()}")
