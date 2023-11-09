class Vehiculo:
    '''
    Definir una clase padre llamada vehículo y dos clases hijas llamadas auto y bicicleta, las cuales heredan de la clase padre Vehículo.
    La clase padre debe tener los sgtes atributos y metodos:

    Vehiculo
    -Atributos (color, ruedas)
    -Metodos (__init__ () y __str__ ())

    Auto
    -Atributos (velocidad (km/h)
    -Metodos (__init__ () y __str__ ())

    Bicicleta
    -Atributo(tipo(urbana , montaña)
    -Metodos (__init__ (color, ruedas, tipo) y __str__ ())

    Crear un objeto para cada clase
    '''

    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return "color: " + self.color + ", ruedas: " + str(self.ruedas)

class Auto(vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__() + ", velocidad(km/h): " + str(self.velocidad)

class bicicleta(vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__() + ", tipo: " + str(self.tipo)

vehiculo = Vehiculo("Rojo", 10)
print(vehiculo)

auto = Auto("Amarillo", 10, 50)
print(auto)

bici = Bicicleta("Negro", 5, "Montaña")
print(bici)