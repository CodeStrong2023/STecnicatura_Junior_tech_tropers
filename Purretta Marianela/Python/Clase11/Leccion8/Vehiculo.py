class Vehiculo:
    '''
    Definir una clase padre llamada vehículo y dos clases hijas llamdas
    Auto y Bicicleta, las cuales heredan de la clase padre Vehículo.
    '''
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return "Color: " + self.color + ", Ruedas: " + str(self.ruedas)

class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__() + ", Velocidad(km/h): " + str(self.velocidad)

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__() + ", Tipo: " + str(self.tipo)

#Primer objeto de la clase padre vehiculo
vehiculo = Vehiculo("Negro", 4)
print(vehiculo)

#Segundo objeto pero ahora de la clase Auto
auto = Auto("Gris", 4, 100)
print(auto)

#Tercer objeto pero ahora de la clase Bicicleta
bici = Bicicleta("Azul", 2, "Urbana")
print(bici)